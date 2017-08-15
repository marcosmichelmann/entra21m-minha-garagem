/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import model.Carro;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alunos
 */
public class CarroDaoJUnitTest {
    
    @Test
    public void inserir() {
        Carro gol = new Carro();
        gol.setDataCompra(new Date(2017, 8, 14));
        gol.setAnoFabricacao((short) 2017);
        gol.setAnoLancamento((short) 2017);
        gol.setChassi("5151874");
        gol.setCor("Vermelho");
        gol.setDescricao("adjshdskajhd shdsakjhdkajshd sjhdjkashdahd");
        gol.setEstaFuncional(false);
        gol.setFabricante("VW");
        gol.setNome("Gol");
        gol.setPlaca("FLA-2017");
        gol.setPotencia(100);
        gol.setPermitidaCirculacao(true);
        gol.setQuantidadeBatidas((byte) 0);
        gol.setQuantidadePortas((byte) 4);
        gol.setQuilometragem(15887f);
        gol.setTipoPneu((short) 17);
        gol.setRenavan(198745);
        
        CarroDAO dao = new CarroDAO();
        dao.truncate();
        int codigo = dao.inserir(gol);
        assertEquals(codigo, 1);
        
        gol.setId(codigo);
        
        Carro carroBuscado = dao.buscarPorId(codigo);
        validarIgualdadeCarro(gol, carroBuscado);
        
    }
    
    @Test
    public void excluir() {
        Carro gol = new Carro();
        gol.setDataCompra(new Date(2017, 8, 14));
        gol.setAnoFabricacao((short) 2017);
        gol.setAnoLancamento((short) 2017);
        gol.setChassi("5151874");
        gol.setCor("Vermelho");
        gol.setDescricao("adjshdskajhd shdsakjhdkajshd sjhdjkashdahd");
        gol.setEstaFuncional(false);
        gol.setFabricante("VW");
        gol.setNome("Gol");
        gol.setPlaca("FLA-2017");
        gol.setPotencia(100);
        gol.setPermitidaCirculacao(true);
        gol.setQuantidadeBatidas((byte) 0);
        gol.setQuantidadePortas((byte) 4);
        gol.setQuilometragem(15887f);
        gol.setTipoPneu((short) 17);
        gol.setRenavan(198745);
        
        CarroDAO dao = new CarroDAO();
        dao.truncate();
        int codigo = dao.inserir(gol);
        dao.excluir(codigo);
        
        Carro carroBuscado = dao.buscarPorId(codigo);
        assertNull(carroBuscado);
        
    }
    
    @Test
    public void alterar(){
        Carro gol = new Carro();
        gol.setDataCompra(new Date(2017, 8, 14));
        gol.setAnoFabricacao((short) 2017);
        gol.setAnoLancamento((short) 2017);
        gol.setChassi("5151874");
        gol.setCor("Vermelho");
        gol.setDescricao("adjshdskajhd shdsakjhdkajshd sjhdjkashdahd");
        gol.setEstaFuncional(false);
        gol.setFabricante("VW");
        gol.setNome("Gol");
        gol.setPlaca("FLA-2017");
        gol.setPotencia(100);
        gol.setPermitidaCirculacao(true);
        gol.setQuantidadeBatidas((byte) 0);
        gol.setQuantidadePortas((byte) 4);
        gol.setQuilometragem(15887f);
        gol.setTipoPneu((short) 17);
        gol.setRenavan(198745);
        
        CarroDAO dao = new CarroDAO();
        dao.truncate();
        int codigo = dao.inserir(gol);
        gol.setId(codigo);
        gol.setDataCompra(new Date(2015, 10, 20));
        gol.setAnoFabricacao((short) 2012);
        gol.setAnoLancamento((short) 2012);
        gol.setChassi("1000000");
        gol.setCor("Preto");
        gol.setDescricao("hhhhhhhh iiiiiii pppppppp");
        gol.setEstaFuncional(false);
        gol.setFabricante("FIAT");
        gol.setNome("Palio");
        gol.setPlaca("PAL-2017");
        gol.setPotencia(110);
        gol.setPermitidaCirculacao(true);
        gol.setQuantidadeBatidas((byte) 0);
        gol.setQuantidadePortas((byte) 4);
        gol.setQuilometragem(15887f);
        gol.setTipoPneu((short) 16);
        gol.setRenavan(198846);
        dao.alterar(gol);
        
        Carro carroModificado = dao.buscarPorId(gol.getId());
        validarIgualdadeCarro(gol, carroModificado);
        
        
    }
    
    public void validarIgualdadeCarro(Carro carro, Carro outroCarro) {
        assertEquals(carro.getId(), outroCarro.getId());
        assertEquals(carro.getAnoFabricacao(), outroCarro.getAnoFabricacao());
        assertEquals(carro.getAnoLancamento(), outroCarro.getAnoLancamento());
        assertEquals(carro.getChassi(), outroCarro.getChassi());
        assertEquals(carro.getCor(), outroCarro.getCor());
        assertEquals(carro.getDataCompra(), outroCarro.getDataCompra());
        assertEquals(carro.getDescricao(), outroCarro.getDescricao());
        assertEquals(carro.isEstaFuncional(), outroCarro.isEstaFuncional());
        assertEquals(carro.getFabricante(), outroCarro.getFabricante());
        assertEquals(carro.getNome(), outroCarro.getNome());
        assertEquals(carro.getPlaca(), outroCarro.getPlaca());
        assertEquals(carro.getPotencia(), outroCarro.getPotencia(), 0);
        assertEquals(carro.isPermitidaCirculacao(), outroCarro.isPermitidaCirculacao());
        assertEquals(carro.getQuantidadeBatidas(), outroCarro.getQuantidadeBatidas());
        assertEquals(carro.getQuantidadePortas(), outroCarro.getQuantidadePortas());
        assertEquals(carro.getQuilometragem(), outroCarro.getQuilometragem(), 0);
        assertEquals(carro.getRenavan(), outroCarro.getRenavan());
        assertEquals(carro.getTipoPneu(), outroCarro.getTipoPneu());
        
    }
    
}
