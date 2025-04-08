package org.acme.reproducer.b; // Adjust package for B and C

import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import io.minio.MinioClient;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
public class ServiceBTest {

    @Inject
    MinioClient minioClient;

    @Test
    void testMinioClientAvailable() {
        assertNotNull(minioClient, "MinioClient should be injected by Quarkus Dev Services");
        System.out.println("Service A Test: Minio client injected. Container should be running.");
        // No need for actual Minio interaction, just triggering the service start is enough
    }
}
