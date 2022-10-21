package json.escritor.utilities;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import json.escritor.domain.Data;
import json.escritor.domain.Producto;

public class Escritor {

	public static void escribir() {
		// Example of Data (object)>>>
		ArrayList <Producto> productos = new ArrayList<Producto> ();
		productos.add(new Producto("modelo1","marca1"));
	    Data data = new Data("Telefonocia",4, productos);
	    //Saving the Data (object) in json>
		try {
	    // create a map
	    Map<String, String> map = new HashMap<String, String>();
	    map.put("cliente", data.getCliente().toString());
	    map.put("maquinas", data.getMaquinas().toString());
	    map.put("productos", data.getProductos().toString());

	    // create object mapper instance
	    ObjectMapper mapper = new ObjectMapper();

	    // convert map to JSON file
	    mapper.writeValue(Paths.get("data.json").toFile(), map);

	} catch (Exception ex) {
	    ex.printStackTrace();
	}
	
	}
	
	
}
