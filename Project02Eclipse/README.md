Sample project for OpenClassroom's fundamentals of Java

Etape 1 :
Commencer par instancier la classe FileProperties liée au fichier application.properties contenant les fichiers d'entée et de sortie de l'application

Etape 2 : 
Instancier la classe ReadSymptomDataFromFile en mettant en valeur la méthode displayProperties avec le nom de la clé

Etape 3: 
Instancier la classe CountSymptomData en mettant en valeur le nouvel objet de la classe ISymptomReader

Etape 4 :
Instancier une nouvelle fois la classe FileProperties

Etape 5 : 
Instancier la classe DataWriterOnFile sur le même principe que l'étape 2

Etape 6 : 
Appeler la méthode "write" de la classe DataWriterOnFile avec le nouvel objet de cette dernière en rentrant en paramètre le résultat de la méthode "countList"

