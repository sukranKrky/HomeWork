package eTicaretÖdev.core.googleEmail;

import eTicaretÖdev.core.EmailService;
import eTicaretÖdev.googleEmail.GoogleMailManager;

public class GoogleMailManagerAdapter implements EmailService{
	
	private GoogleMailManager googleMailManager;
	

	public GoogleMailManagerAdapter() {
		super();
		this.googleMailManager =new  GoogleMailManager();
	}


	@Override
	public void send(String eMail, String massage) {
		googleMailManager.send(eMail, massage);
		
		
	}

}
