package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        if (productRepository.count() == 0 && partRepository.count() == 0) {

            // ===== PARTS =====
            OutsourcedPart mouse = new OutsourcedPart();
            mouse.setCompanyName("Logitech");
            mouse.setName("Gaming Mouse");
            mouse.setInv(10);
            mouse.setMin(1);
            mouse.setMax(20);
            mouse.setPrice(25.0);
            outsourcedPartRepository.save(mouse);

            OutsourcedPart keyboard = new OutsourcedPart();
            keyboard.setCompanyName("Corsair");
            keyboard.setName("Mechanical Keyboard");
            keyboard.setInv(8);
            keyboard.setMin(1);
            keyboard.setMax(15);
            keyboard.setPrice(75.0);
            outsourcedPartRepository.save(keyboard);

            OutsourcedPart usb = new OutsourcedPart();
            usb.setCompanyName("Anker");
            usb.setName("USB-C Cable");
            usb.setInv(20);
            usb.setMin(5);
            usb.setMax(30);
            usb.setPrice(10.0);
            outsourcedPartRepository.save(usb);

            OutsourcedPart monitor = new OutsourcedPart();
            monitor.setCompanyName("Dell");
            monitor.setName("27-inch Monitor");
            monitor.setInv(5);
            monitor.setMin(1);
            monitor.setMax(10);
            monitor.setPrice(200.0);
            outsourcedPartRepository.save(monitor);

            OutsourcedPart hdmi = new OutsourcedPart();
            hdmi.setCompanyName("Amazon Basics");
            hdmi.setName("HDMI Cable 3-Pack");
            hdmi.setInv(15);
            hdmi.setMin(2);
            hdmi.setMax(25);
            hdmi.setPrice(18.0);
            outsourcedPartRepository.save(hdmi);

            // ===== PRODUCTS =====
            Product office = new Product("Office Workstation Bundle", 400.0, 5);
            Product gaming = new Product("Gaming Setup Bundle", 600.0, 3);
            Product home = new Product("Home Office Starter Kit", 250.0, 6);
            Product streaming = new Product("Streaming Desk Setup", 450.0, 4);
            Product productivity = new Product("Productivity Pack", 150.0, 7);

            productRepository.save(office);
            productRepository.save(gaming);
            productRepository.save(home);
            productRepository.save(streaming);
            productRepository.save(productivity);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
