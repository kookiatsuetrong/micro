/*
create database tesla;
create user elon identified with mysql_native_password by 'musk';
grant all on tesla.* to elon;
*/

import java.util.*;
import spark.*;
import javax.persistence.*;

class Start {
	public static void main(String ... zzz) {
		View view = new View();
		Spark.get("/test-add", (req,res) -> {
			Student s = new Student();
			s.name = "Elon M";
			s.score = 89.15;
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("main");
			EntityManager manager = factory.createEntityManager();
			manager.getTransaction().begin();
			manager.persist(s);
			manager.getTransaction().commit();
			return "OK";
		});
		
		Spark.get("/test", (req, res) -> 555 );
		Spark.get("/show", (req, res) -> {
			Map m = new HashMap();
			m.put("user", "James Bond");
			return view.render("/welcome.html", m);
		});
	}
}
