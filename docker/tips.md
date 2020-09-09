
```bash
docker exec -it $1 sh
```

```bash
curl http://localhost:8001/actuator/info
curl -X POST http://localhost:8001/carts/submit
curl -X POST -d {} -H "Content-Type: application/json" http://localhost:8002/orders
```

```bash
nslookup order-service
nslookup cart-service
```

> docker logs: /var/lib/docker
