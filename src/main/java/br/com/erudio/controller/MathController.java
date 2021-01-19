package br.com.erudio.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.erudio.request.converters.NumberConverter;

import br.com.erudio.exception.UnsuportedMathOperationException;
import br.com.erudio.math.SimpleMath;

@RestController
public class MathController {
	
	//private final String template = "Hello, %s!";
	//private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping(value="/op/{numberOne}/{numberTwo}/{numberThree}",method = RequestMethod.GET)
	public Double op(@PathVariable("numberOne")String numberOne,@PathVariable("numberTwo")String numberTwo,@PathVariable("numberThree")String numberThree) throws Exception {
		SimpleMath math = new SimpleMath();
		
		if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo) || !NumberConverter.isNumeric(numberThree)) {
			throw new UnsuportedMathOperationException("Please set a numeric value 1 to 6:");
		}
			double op = 0.0;
			double x = NumberConverter.convertToDouble(numberOne);
			double y = NumberConverter.convertToDouble(numberTwo);
			
			switch(NumberConverter.convertToInt(numberThree)) {
		
			case 1:
				op = math.sum(x, y);
				break;
			case 2:	
				op = math.sub(x, y);
				break;
			case 3:
				op = math.mult(x, y);
				break;
			case 4:
				op = math.div(x, y);
				break;
			case 5:
				op = math.avg(x, y);
				break;
			case 6:
				op = math.sqrt(x, y);
				break;
			default:
				throw new UnsuportedMathOperationException("Please set a numeric value 1 to 6:");
			}
			return op;
	}		
}