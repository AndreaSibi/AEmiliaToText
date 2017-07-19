# aemilia-to-text
Model2text transformation da un modello Aemilia (generato per mezzo di una text2Model transformation da un file *.aem*, utilizzando il linguaggio Gra2Mol) alla specifica *.aem* testuale iniziale.

## Installazione
- Eclipse Neon J2EE (possiede già diversi plugin necessari all'esecuzione)
- OCL Plugin (from updateSite)
- Acceleo Plugin (from marketplace)

## Struttura del Progetto (concetti principali)
- Aemilia2Text_MetaInf
	- */model*: contiene il metamodello sul quale la trasformazione lavora (*mmAemilia.ecore*)
- org.eclipse.acceleo.module.aemiliaMod2text
	- */case-studies*: file degli esempi sui quali si è lavorato
	- */m2t*: modelli Aemilia generati per mezzo del tool *TwoEagles*
	- */t2m*: questa cartella dovrebbe contenere i file di output generati dalla trasformazione Model2text (per il momento sono posizionati in /output)
  
## Limitazioni
- Inizializzazione tramite espressione:
  
    EX (dalla sintassi Aemilia per la dichiarazione delle architectural interactions, ma vale in qualsiasi parte compaia la stessa tipologia di sintassi): 
	
   >`<architectural_interaction_decl> ::= <identifier> ["[" <expr> "]"] "." <identifier>`
   >
   >  						 | "FOR_ALL" <identifier> "IN" <expr> ".." <expr>
   >
   >						 <identifier> "[" <expr> "]" "." <identifier>

   La selezione mediante `["[" <expr> "]"]` non è contemplata nella trasformazione, dunque eventuali futuri modelli che ne faranno uso non saranno tradotti correttamente. 
- Mancato utilizzo del costrutto FORALL della sintassi Aemilia. Sarà comunque sostituito da dichiarazioni singole.
- Mancata gestione della sezione Behavioral Variations di Aemilia, causa mancanza delle informazioni necessarie alla stessa nel metamodello.

## In lavorazione
- Generazione file *.rew*

## Problemi riscontrati
  Fare riferimento alle issues nel repository	

## Note
- Il nome dell'ARCHI TYPE di alcuni file input *.aem* è lo stesso. Questo porta alla sovrascrittura dell'output generato da un altro file (semplicemente perché si chiamano nello stesso modo e quindi anche il file di output ha lo stesso identico nome), quindi casomai una volta generati i files di output sarebbe buona prassi modificare il nome manualmente per evitare questa situazione, assegnandogli un nome univoco. 
- Su alcuni file *.aem* di esempio esistono dei problemi. Per alcuni non viene generato il modello mediante trasformazione text2Mod, per altri esistono errori sulla sintassi Aemilia. Si riportano nella tabella successiva per ogni file *.aem* le 	  	  informazioni relative alla generazione o meno del modello e/o eventuali errori di sintassi. Preferire dunque, al fine di eseguire la trasformazione, i file *.aem* che contengono "YES" in entrambe le relative colonne specifiche.

    |**.aem Filename**|**Model**|**Parsing**|
    |-----|-----|-----|
    |*ABP_VP_Type.aem*|NO|NO|
    |*aemiliaBSx.aem*|NO|YES|
   	|*CheckIn Model.aem*|NO|YES|
   	|*FTA_system.aem*|NO|YES|
   	|*ABP_Type.aem*|YES|NO|
   	|*BoA.aem*|YES|YES|
   	|*eds_RAMP_refactoring.aem*|YES|YES|
   	|*eds.aem*|YES|YES|
   	|*EmergencyHandling.aem*|YES|YES|
   	|*FTA.aem*|YES|YES|
   	|*FTA3.aem*|YES|YES|
   	|*SituationMonitoring.aem*|YES|YES|

## Eseguire i test
Per eseguire la trasformazione procedere come segue:
- Caricare il progetto Aemilia2Text_MetaInf nel workspace della versione specifica di Eclipse
- Registrare il metamodello mmAEmilia.ecore presente nella cartella *model* dello stesso e rigenerare il codice del metamodello
- Eseguire il progetto Aemilia2Text_MetaInf come una nuova istanza Eclipse e in quest'ultima caricare il progetto Acceleo org.eclipse.acceleo.module.aemiliaMod2text
- Nella cartella *src/main*, eseguire ora la main class *generate.mtl* come Acceleo Application, chiaramente settando i dovuti parametri  
