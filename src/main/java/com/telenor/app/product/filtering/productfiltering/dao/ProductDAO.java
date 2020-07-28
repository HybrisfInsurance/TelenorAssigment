package com.telenor.app.product.filtering.productfiltering.dao;

import org.springframework.stereotype.Repository;

import com.telenor.app.product.filtering.productfiltering.model.Product;
import com.telenor.app.product.filtering.productfiltering.model.Products;

@Repository
public class ProductDAO {
	private static Products list = new Products();

	static 
    {
    	list.getProductList().add(new Product("phone","color:grÃ¶n",277,"Blake grÃ¤nden, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",415,"Odell gatan, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",202,"Fausto vÃ¤gen, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("phone","color:purpur",130,"Gustafsson gÃ¤rdet, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("phone","color:guld",271,"Nilsson allÃ©n, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("phone","color:guld",45,"Gustafsson gÃ¤rdet, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",178,"Karlsson allÃ©n, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("phone","color:brun",380,"Svensson gatan, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",991,"Emma allÃ©n, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("phone","color:brun",17,"Eriksson vÃ¤gen, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("phone","color:purpur",704,"Eriksson gatan, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",467,"Kirsten grÃ¤nden, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",334,"Candido grÃ¤nden, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",676,"Nilsson gatan, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("phone","color:brun",952,"Olsson allÃ©n, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("phone","color:rosa",705,"Larsson vÃ¤gen, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("phone","color:indigo",345,"Glen allÃ©n, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",738,"Karlsson allÃ©n, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",869,"Flo vÃ¤gen, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",476,"Johansson gatan, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",431,"Margarita allÃ©n, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",581,"Persson grÃ¤nden, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",995,"Karlsson gatan, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",636,"Alvina grÃ¤nden, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",99,"Eriksson allÃ©n, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",599,"Olsson gatan, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",739,"Karlsson gÃ¤rdet, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",74,"Karlsson allÃ©n, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",578,"Madge allÃ©n, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("phone","color:brun",677,"Granville vÃ¤gen, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",445,"Delfina grÃ¤nden, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("phone","color:grÃ¥",708,"Jamie allÃ©n, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("phone","color:rÃ¶d",175,"Eriksson vÃ¤gen, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("phone","color:grÃ¥",951,"Laurianne vÃ¤gen, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("phone","color:rosa",955,"Karlsson allÃ©n, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",204,"Karlsson allÃ©n, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("phone","color:rosa",475,"Karlsson vÃ¤gen, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("phone","color:vit",388,"Tyson gÃ¤rdet, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("phone","color:silver",894,"Nilsson grÃ¤nden, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",584,"Amaya allÃ©n, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("phone","color:vit",672,"Olsson allÃ©n, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("phone","color:lila",272,"Millie vÃ¤gen, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",774,"Nilsson gatan, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",191,"Hazel allÃ©n, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",474,"Karlsson gÃ¤rdet, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",37,"Johansson gÃ¤rdet, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",255,"Rosella grÃ¤nden, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",738,"Johansson gatan, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",342,"Lorna vÃ¤gen, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",800,"Olsson gatan, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("phone","color:silver",528,"Jaydon allÃ©n, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",62,"Juston gÃ¤rdet, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",300,"Allene grÃ¤nden, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",102,"Rachelle gÃ¤rdet, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",497,"Johansson gatan, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("phone","color:silver",749,"Nilsson gÃ¤rdet, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",643,"Ludwig gÃ¤rdet, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("phone","color:rosa",263,"Ezekiel grÃ¤nden, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",470,"Jasmin vÃ¤gen, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",971,"Noble gÃ¤rdet, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",432,"Larsson allÃ©n, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("phone","color:guld",670,"Persson grÃ¤nden, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",809,"Camille gÃ¤rdet, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("phone","color:brun",58,"Karlsson gatan, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("phone","color:rosa",264,"Esther gÃ¤rdet, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("phone","color:grÃ¥",87,"Johansson vÃ¤gen, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",208,"Persson allÃ©n, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("phone","color:guld",53,"Sheridan grÃ¤nden, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",282,"Olsson gatan, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("phone","color:grÃ¶n",299,"Alberta grÃ¤nden, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",34,"Andersson allÃ©n, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("phone","color:guld",546,"Zora gÃ¤rdet, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("phone","color:guld",49,"Patrick gatan, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",250,"Edmund gÃ¤rdet, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",454,"Emmalee grÃ¤nden, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("phone","color:guld",967,"Svensson allÃ©n, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",527,"Ardella gÃ¤rdet, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",784,"Persson vÃ¤gen, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",676,"Persson gÃ¤rdet, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("phone","color:grÃ¶n",415,"Hollis grÃ¤nden, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("phone","color:gul",172,"Winona gatan, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("phone","color:gul",224,"Johansson gatan, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("phone","color:silver",904,"Gustafsson gÃ¤rdet, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",699,"Gustafsson vÃ¤gen, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("phone","color:grÃ¶n",81,"Larsson vÃ¤gen, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("phone","color:silver",250,"Grady gatan, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("phone","color:grÃ¶n",148,"Olsson vÃ¤gen, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("phone","color:svart",26,"Persson gatan, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",837,"Tremaine vÃ¤gen, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",214,"Nilsson vÃ¤gen, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("phone","color:grÃ¥",288,"Persson vÃ¤gen, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",227,"Cecil grÃ¤nden, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",62,"Svensson allÃ©n, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",951,"Nilsson gatan, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",271,"Barney grÃ¤nden, MalmÃ¶","MalmÃ¶"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",705,"Karlsson vÃ¤gen, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:10",953,"Loyal vÃ¤gen, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",130,"Karlsson grÃ¤nden, Karlskrona","Karlskrona"));
    			list.getProductList().add(new Product("phone","color:silver",474,"Caesar gatan, Stockholm","Stockholm"));
    			list.getProductList().add(new Product("subscription","gb_limit:50",592,"Donavon allÃ©n, Stockholm","Stockholm"));
    
    }

	public Products getAllProducts() {
		return list;
	}

	public void addProduct(Product Product) {
		list.getProductList().add(Product);
	}
}
