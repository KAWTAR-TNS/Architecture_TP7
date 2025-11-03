# Architecture des microservices - TP 7

![Build Status](https://github.com/ton-username/ton-projet/actions/workflows/maven.yml/badge.svg)
![Java](https://img.shields.io/badge/-Java-007396?logo=java)
![Spring Boot](https://img.shields.io/badge/-Spring_Boot-6DB33F?logo=springboot)
![H2 Database](https://img.shields.io/badge/-H2%20DB-007396?logo=h2database)
![Maven](https://img.shields.io/badge/-Maven-C71A36?logo=apachemaven)
![License](https://img.shields.io/github/license/ton-username/ton-projet)

---

## Description

Ce projet est un TP réalisé avec **Spring Boot** intégrant :

- Spring Web pour exposer des API REST
- Spring Data JPA pour la gestion des données
- Base de données H2 en mémoire pour simplifier le développement
- Jersey pour intégrer JAX-RS
- Lombok pour générer automatiquement getters/setters, etc.
- DevTools pour un rechargement rapide en dev

---

## Prérequis

- Java 25
- Maven 3.x
- Docker (optionnel)

---

## Installation et exécution

### Lancer avec Maven

```bash
mvn clean spring-boot:run
