Prefix: : <http://master.hib.no/OntologyCPN/cpn>
Prefix: xsd: <http://www.w3.org/2001/XMLSchema#>
Prefix: owl: <http://www.w3.org/2002/07/owl#>
Prefix: basic: <http://k1s.org/OntologyReastrictedNets/basic>
Prefix: cpn: <http://master.hib.no/OntologyCPN/cpn>

Ontology: <http://master.hib.no/OntologyCPN/cpn>

Class: Page
	
Class: Node
	DisjointWith: Page

Class: Place
	SubClassOf: Node exactly 1

Class: Transition
	SubClassOf: Node exactly 1
	
