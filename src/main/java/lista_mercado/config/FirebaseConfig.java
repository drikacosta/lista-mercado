// package lista_mercado.config;

// import java.io.FileInputStream;
// import java.io.IOException;
// import java.io.InputStream;

// import javax.annotation.PostConstruct;

// import org.springframework.context.annotation.Configuration;

// import com.google.auth.oauth2.GoogleCredentials;
// import com.google.firebase.FirebaseApp;
// import com.google.firebase.FirebaseOptions;

// @Configuration
// public class FirebaseConfig {

//     @PostConstruct
//     public void initializeFirebase() {
//         try (FileInputStream serviceAccount = new FileInputStream("firebase-adminsdk.json")) {
//             FirebaseOptions options = FirebaseOptions.builder()
//                     .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//                     .setDatabaseUrl("https://lista-mercado-34213-default-rtdb.firebaseio.com")
//                     .build();
//             FirebaseApp.initializeApp(options);
//         } catch (IOException e) {
//             throw new RuntimeException("Erro ao inicializar o Firebase", e);
//         }
//     }

// }