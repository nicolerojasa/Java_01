import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AreaRectanguloTest {
	@Test
	public void testAreaRectangulo() {
		int area = AreaRectangulo.area(3, 2);
		assertEquals(6, area);
	}
}
