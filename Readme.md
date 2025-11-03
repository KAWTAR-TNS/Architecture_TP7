# Architecture des microservices - TP 7

![Build Status](https://github.com/KAWTAR-TNS/Architecture_TP7/actions/workflows/maven.yml/badge.svg)
![Java](https://img.shields.io/badge/-Java-007396?logo=java)
![Spring Boot](https://img.shields.io/badge/-Spring_Boot-6DB33F?logo=springboot)
![H2 Database](https://img.shields.io/badge/-H2%20DB-007396?logo=h2database)
![Maven](https://img.shields.io/badge/-Maven-C71A36?logo=apachemaven)

---
## Console H2

<div style="border: 2px solid #333; padding: 10px; display: flex; gap: 10px; max-width: fit-content;">

  <img src="./docs/h2-1.png.png" alt="Console H2 - Vue 1" style="border: 1px solid #999; max-width: 300px;" />
  <img src="./docs/h2-2.png2.png" alt="Console H2 - Vue 2" style="border: 1px solid #999; max-width: 300px;" />

</div>

## JSON sur SoapUI

<div style="border: 2px solid #333; padding: 10px; max-width: fit-content;">
  <img src="./docs/json.png.png" alt="JSON SoapUI" style="border: 1px solid #999; max-width: 600px;" />
</div>

## XML sur Postman

<div style="border: 2px solid #333; padding: 10px; max-width: fit-content;">
  <img src="./docs/xml.png" alt="XML Postman" style="border: 1px solid #999; max-width: 600px;" />
</div>

## Description

 TP réalisé avec **Spring Boot** intégrant :

- Spring Web pour exposer des API REST
- Spring Data JPA pour la gestion des données
- Base de données H2 en mémoire pour simplifier le développement
- Jersey pour intégrer JAX-RS
- Lombok pour générer automatiquement getters/setters, etc.

---

## Prérequis

- Java 25
- Maven 3.x

---

## Installation et exécution

### Lancer avec Maven

```bash
mvn clean spring-boot:run
