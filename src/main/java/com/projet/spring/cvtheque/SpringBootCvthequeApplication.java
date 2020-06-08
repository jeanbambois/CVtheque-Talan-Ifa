package com.projet.spring.cvtheque;




import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class SpringBootCvthequeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCvthequeApplication.class, args);
	}
	
	/*@Bean
	public CommandLineRunner commandLinerRunner(ProfileRepository profileRepository,CityRepository cityRepository,CountryRepository countryRepository,GenderRepository genderRepository,
			ProExpRepository proExpRepository,CompanyRepository companyRepository,NationalityRepository nationalityRepository) {
		
		return(args)->{
			
			//create and save gender
			Gender tempGender1 = new Gender("Male");
			genderRepository.save(tempGender1);
			
			//create and save country
			Country tempCountry1 = new Country("France");
			countryRepository.save(tempCountry1);
			
			//create city
			City tempCity1 = new City("Metz");
			City tempCity2 = new City("Thionville");
			tempCountry1.addCity(tempCity1);
			tempCountry1.addCity(tempCity2);
			cityRepository.save(tempCity1);
			cityRepository.save(tempCity2);
			
			//create nationality
			 Nationality tempNationality1 = new Nationality("Francaise");
			 nationalityRepository.save(tempNationality1);
			 
			
			//create some profiles
			Profile tempProfile1 = new Profile("Paye","Baba",LocalDate.of(1979, Month.FEBRUARY,04),"70,rue du bois","57","0689329060","manemifr@gmail.com","xxxxx12",1,"assets/profiles/photos/baba.png");
			Profile tempProfile2 = new Profile("smith","nicolas",LocalDate.of(1979, Month.AUGUST,05),"50,rue de lothaire","57","0689329061","nicolas@gmail.com","xxxxx13",1,"assets/profiles/photos/nicolas.png");
			
			// profiles to gender
			tempGender1.addProfile(tempProfile1);
			tempGender1.addProfile(tempProfile2);
			
			
			//profiles to city
			tempCity1.addProfile(tempProfile1);
			tempCity1.addProfile(tempProfile2);
			
			//profiles to nationality
			tempNationality1.addProfile(tempProfile1);
			tempNationality1.addProfile(tempProfile2);
			
			
			//save profiles
			profileRepository.save(tempProfile1);
			profileRepository.save(tempProfile2);
			
			//create ProExp
			ProExp tempProExp = new ProExp(LocalDate.of(2010, Month.JANUARY, 02),LocalDate.of(2015, Month.DECEMBER, 23));
			ProExp tempProExp1 = new ProExp(LocalDate.of(2018, Month.APRIL, 22),LocalDate.of(2019, Month.JULY, 11));
			
			
			//create city proEXP
			City tempCity3 = new City("Briey");
			tempCountry1.addCity(tempCity3);
			cityRepository.save(tempCity3);
			tempCity3.addProExp(tempProExp);
			
			City tempCity4 = new City("Paris");
			tempCountry1.addCity(tempCity4);
			cityRepository.save(tempCity4);
			tempCity4.addProExp(tempProExp1);
			
			
			//create company
			Company tempCompany = new Company("LINDAL");
			companyRepository.save(tempCompany);
			tempCompany.addProExp(tempProExp);
			tempProfile1.addProExp(tempProExp);
			
			Company tempCompany1 = new Company("TALAN");
			companyRepository.save(tempCompany1);
			tempCompany1.addProExp(tempProExp1);
			tempProfile2.addProExp(tempProExp1);
			
			proExpRepository.save(tempProExp);
			proExpRepository.save(tempProExp1);
			
			
			
		};
	}*/

}
