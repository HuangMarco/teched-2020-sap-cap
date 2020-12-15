 package com.sap.cap.productsservice.handlers;

 import java.util.HashMap;
 import java.util.Map;

 import org.springframework.stereotype.Component;

 import com.sap.cds.services.cds.CdsCreateEventContext;
 import com.sap.cds.services.cds.CdsReadEventContext;
 import com.sap.cds.services.cds.CdsService;
 import com.sap.cds.services.handler.EventHandler;
 import com.sap.cds.services.handler.annotations.On;
 import com.sap.cds.services.handler.annotations.ServiceName;

 @Component
 @ServiceName("AdminService")
 public class AdminService implements EventHandler {

     private Map<Object, Map<String, Object>> products = new HashMap<>();

     @On(event = CdsService.EVENT_CREATE, entity = "AdminService.Products")
     public void onCreate(CdsCreateEventContext context) {
         context.getCqn().entries().forEach(e -> products.put(e.get("ID"), e));
         context.setResult(context.getCqn().entries());
     }

     @On(event = CdsService.EVENT_READ, entity = "AdminService.Products")
     public void onRead(CdsReadEventContext context) {
         context.setResult(products.values());
     }

 }