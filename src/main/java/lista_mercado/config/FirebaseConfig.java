package lista_mercado.config;

import java.io.FileInputStream;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Configuration
public class FirebaseConfig {

    @PostConstruct
    public void initialize () throws IOException {
        FileInputStream serviceAccount = 
            new FileInputStream("src/main/resource/firebase-adminsdk.json");
        
        FirebaseOptions options = FirebaseOptions.builder()
            .setCredentials(GoogleCredentials.fromStream(serviceAccount))
            .setDatabaseUrl("https://lista-mercado-34213-default-rtdb.firebaseio.com/")
            .build();

        FirebaseApp.initializeApp(options);
    }

}