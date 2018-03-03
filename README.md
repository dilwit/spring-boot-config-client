# spring-boot-config-client

- Depends on centerlized config server to acquire configuration<br>
- Makes secured (HTTP-Basic Authentication) connection to config-server <br>
- Configuration is acquired at start-up, starting up fail if no config-server found <br>
- Refresh config via secured actuator endpoints - TODO
