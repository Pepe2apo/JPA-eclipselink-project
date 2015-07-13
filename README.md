# JPA-eclipselink-project
Exemple de projetJPA utilisant l'implémentation EclipseLink 

JPA: java persistance api est une specification pour la persistance d'un mapping O/R. L'API décrit comment mapper des objets Java avec une base de données relationnelle. Ce mapping permet d'assure la transformation d'object en base de donnée et vice versa que cela soit pour les lectures, des mises à jour (création, modification ou suppression).

Cette API possède différentes implémentation: EclipseLik, Hibernate, TopLink, OpenJPA,....

L'API propose un langage d'interrogation similaire à SQL mais utilisant des objets plutôt que des entités relationnelles de la base de données.

L'API Java Persistence repose sur des entités qui sont de simples POJOs annotés et sur un gestionnaire de ces entités (EntityManager) qui propose des fonctionnalités pour les manipuler (ajout, modification suppression, recherche). Ce gestionnaire est responsable de la gestion de l'état des entités et de leur persistance dans la base de données.
 
 Relations unidirectionnelles et bidirectionnelles:
 
Notons encore une fois que c'est la présence de l'attribut mappedBy qui crée le caractère bidirectionnel de la relation. Si l'on ne le met pas, alors JPA créera une seconde table de jointure.

JPA nous pose une contrainte ici : l'attribut mappedBy est défini pour l'annotation @OneToMany, mais pas pour l'annotation @ManyToOne.

Comportement cascade:

L' entity manager permet de mener à bien cinq opérations sur une entité : DETACH, MERGE, PERSIST, REMOVE, REFRESH.

Le comportement cascade consiste à spécifier ce qui se passe pour une entité en relation d'une entité père (que cette relation soit monovaluée ou multivaluée), lorsque cette entité père subit une des opérations définies ci-dessus.

Le comportement cascade est précisé par l'attribut cascade, disponible sur les annotations : @OneToOne, @OneToMany et @ManyToMany. La valeur de cet attribut est une énumération de type CascadeType. En plus des valeurs DETACH, MERGE, PERSIST, REMOVE, REFRESH, cette énumération définit la valeur ALL, qui correspond à toutes les valeurs à la fois.

 Effacement des entités orphelines:
 
  il arrive que des effacements d'entité soient nécessaires sans qu'il y ait eu d'appel à la méthode remove() de l' entity manager .

Dans l'exemple de nos communes et de nos maires, effacer une commune entraînera l'effacement du maire. Mais l'appel à commune.setMaire(null) doit aussi entraîner l'effacement de ce maire, dans la mesure où cette entité sera orpheline.

On dispose pour cela d'un attribut défini sur @OneToOne et @OneToMany : orphanRemoval. Le fait de mettre cet attribut à true activera la détection d'entités orphelines, et leur effacement automatique.
