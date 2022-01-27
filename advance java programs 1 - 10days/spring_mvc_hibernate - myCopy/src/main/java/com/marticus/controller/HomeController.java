package com.marticus.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.marticus.utility.*;




import com.marticus.model.User;
 


@Controller
public class HomeController {

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println("Home Page Requested, locale = " + locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}
	
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public  String user2(@Validated User usr, Model model) {
		System.out.println("User Page Requested");
		
		Session session= HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
//		User u = new User();
//		u.setUserAge(usr.getUserAge());
//		u.setUserName(usr.getUserName());
		session.save(usr);
		session.getTransaction().commit();
		session.close();
		model.addAttribute("status","Data Saved Successfully");
		model.addAttribute("userName", usr.getUserName());
		model.addAttribute("userAge", usr.getUserAge());
 
		return "user";
	}
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String user1(@Validated  User user, Model model) {
		System.out.println("User Page Requested");
	
	    return "form";
	}
	@RequestMapping(value = "/getsearch", method = RequestMethod.POST)
	public  String getuser(String id, Model model) {
		System.out.println("User Page Requested");
		
		Session session= HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		 User u1 = new User();
		 u1.setId(Integer.parseInt(id));
		session.load(u1, new Integer(id));
		model.addAttribute("status","Data Saved Successfully");
		model.addAttribute("userName", u1.getUserName());
		model.addAttribute("userAge", u1.getUserAge());
		session.getTransaction().commit();
		session.close();
		return "formresults";
	}
	


	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public  String update(@Validated  User usr, Model model) {
		System.out.println("User Page Requested");
		
		Session session= HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		 
 
		session.save(usr);
		session.getTransaction().commit();
		session.close();
		model.addAttribute("status","Data Saved Successfully");
		model.addAttribute("userName", usr.getUserName());
		model.addAttribute("userAge", usr.getUserAge());
 
		return "redirect:/userlist";
	}
	 
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public  String getuser(@PathVariable("id") int id, Model model) {
		System.out.println("User Page Requested for deletion");
		
		Session session= HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		User u= new User();
		u.setId(id);
		
		session.load(u,new  Integer(1));
		session.delete(u);
		
		session.getTransaction().commit();
		session.close();
		model.addAttribute("status","Data deleted Successfully");
 
		return "redirect:/userlist";
	}
	
	
	
	@RequestMapping(value = "/userlist", method = RequestMethod.GET)
	public String user(Model model) {
		 //HQL - Hibenate Query Language
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		//select * from Users -- equivalent SQL
		List User =(List) session.createQuery("From User").list();
		ArrayList <User> uList = new ArrayList<User>();
		for (Iterator iterator2 = ((java.util.List) User).iterator(); iterator2.hasNext();){
            User u = (User) iterator2.next(); 
            
            uList.add(u);
            System.out.println("User: " + u.getUserName()); 
         }
		model.addAttribute("uList",uList );

	return "list";
	}
//	@RequestMapping(value = "/userlist", method = RequestMethod.GET)
//	public  String userlist( Model model) {
//		System.out.println("User Page Requested");
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		session.beginTransaction();
//	
//		List User = (List)session.createQuery("From User").list();
//		ArrayList <User> uList = new ArrayList<User>();
//		for (Iterator iterator2 = (Iterator) User.iterator(); iterator2.hasNext();){
//            User u = (User) iterator2.next(); 
//            
//            uList.add(u);
//           System.out.println("User: " + u.getUserName()); 
//         }
//		
//		//for(int i=0;i<uList.size();i++)
//		//{
//			//System.out.println("Name="+uList.get(i).getUserName());
//		//}
//		
//		model.addAttribute("uList",uList );
//
//
//		return "list";
//}
}
