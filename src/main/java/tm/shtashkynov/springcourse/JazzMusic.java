package tm.shtashkynov.springcourse;

import org.springframework.stereotype.Component;

@Component
public class JazzMusic implements Music {

	@Override
	public String getSong() {
		// return a jazz song
		return "What a Wonderful World";
	}
}
