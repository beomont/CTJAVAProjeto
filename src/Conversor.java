
public class Conversor {
	
	
	 public double converteCelsiusParaFahrenheit(double celsius) {
	        return (celsius * (9.0 / 5.0)) + 32;
	    }

	 public double converteFahrenheitParaCelsius(double fahrenheit) {
	        return (fahrenheit - 32) * 5/9;
	    }

	 //fonte: Conversor Google)
	 public double converteFahrenheitParaKelvin(double fahrenheit) {	        
	        return (fahrenheit - 32.0) * 5.0/9.0 + 273.15;
	    }

	 //fonte: Conversor Google)	
	 public double converteKelvinParaFahrenheit(double kelvin) {
	        return (kelvin - 273.15) * 9.0/5.0 + 32;
	    }

	 //(273.15 fonte: Conversor Google)
	 public double converteCelsiusParaKelvin(double celsius) {
	        return celsius + 273.15;
	    }

	 //(273.15 fonte: Conversor Google)
	 public double converteKelvinParaCelsius(double kelvin) {
	        return kelvin - 273.15;
	   }
	 
	 public double converteCelsiusParaCelsius(double celsius) {
	        return celsius;
	   }
	 
	 public double converteFahrenheitParaFahrenheit(double fahrenheit) {
	        return fahrenheit;
	   }
	 
	 public double converteKelvinParaKelvin(double kelvin) {
	        return kelvin;
	   }
	 
	 

}
