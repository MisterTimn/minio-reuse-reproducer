Reproducer for <https://github.com/quarkiverse/quarkus-minio/issues/411#issuecomment-2783398913>

To reproduce, make sure testcontainer reuse is enabled for instance by modifying ~/.testcontainers.properties file:

```properties
testcontainers.reuse.enable=true
```

Then run test:

```bash
./mvnw test
```

Observe 2 minio devservices get created, one for each service, and that they remain active. Then run tests again and observe an additional 2 getting created.
