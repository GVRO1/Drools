package com.example.demo.service;

import com.example.demo.drools.Drools;
import com.example.demo.dto.PedidoDto;
import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.*;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;
import org.springframework.stereotype.Controller;

@Controller
public class PedidoService {

    public PedidoDto adicionarPedido(PedidoDto pedido) {
        Drools drools = new Drools();
        System.out.println(pedido);
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(ResourceFactory.newClassPathResource("planilha.xlsx"), ResourceType.DTABLE);
        KnowledgeBuilderErrors errors = kbuilder.getErrors();

        if (errors.size() > 0) {
            for (KnowledgeBuilderError error : errors) {
                System.err.println(error);
            }
            throw new IllegalArgumentException("Could not parse knowledge.");
        }
        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(kbuilder.getKnowledgePackages());
        StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
        ksession.insert(pedido);
        ksession.fireAllRules();
        System.out.println(pedido);
           // pedidoRepository.save(entity);
        return pedido;
    }
}
