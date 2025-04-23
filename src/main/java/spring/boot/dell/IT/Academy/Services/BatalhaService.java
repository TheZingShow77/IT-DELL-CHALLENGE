package spring.boot.dell.IT.Academy.Services;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.stereotype.Service;

import spring.boot.dell.IT.Academy.model.Batalha;

@Service
public class BatalhaService {

     private final Queue<Batalha> batalhas = new ConcurrentLinkedQueue<>();

    public void addBatalha(Batalha batalha) {
        batalhas.add(batalha);
    }

    public String sorteiaBatalha() {
       Queue<Batalha> batalhas = new ConcurrentLinkedQueue<>();
        Batalha batalha = batalhas.poll();
        if (batalha != null) {
            return batalha.toString();
        } else {
            return "Nenhuma batalha disponível.";
        }
    }
    
    
}
