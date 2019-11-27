import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TelaProjetoTest {

	@Test
	void test() {
		fail("Not yet implemented");
		
	}
	telaProjeto t = new telaProjeto();
	t.setFabrica(new FabricaWindows());
	t.Montar();
	assertEquals("JanelaWindows{"
			+ "MenuWindows, "
			+ "BotaoWindows}",t.Desenhar());
	

}
