<a href="https://www.extrawest.com/"><img src="https://drive.google.com/uc?export=view&id=1kXfNj5WfW2oSMzQR82xYBI6Bw_W8-LpK" width="20%"></a>
# Extrawest-OCPI-2.2.1-EMSP-Client

Implementations of Extrawest-OCPI-2.2.1-EMSP-Server services to run openApi docs on http://localhost:8080/swagger-ui/index.html#/

To regenerate client's classes use cli command:
```shell
java -jar openapi-generator-cli-6.6.0.jar generate \
-i http://localhost:8080/v3/api-docs \
--api-package com.extrawest.ocpi.emsp.client.api \
--model-package com.extrawest.ocpi.emsp.client.model \
--invoker-package com.extrawest.ocpi.emsp.client.invoker \
--group-id com.extrawest \
--artifact-id Extrawest-OCPI-2.2.1-EMSP-Client \
--artifact-version 2023.8.18 \
-g java \
-p java11=true \
--library resttemplate \
-o ./openapi-resttemplate-client
```
