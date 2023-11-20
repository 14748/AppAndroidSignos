package com.example.appsignos.utils;

import com.example.appsignos.R;
import com.example.appsignos.models.Categoria;
import com.example.appsignos.models.Palabra;

import java.util.AbstractMap;
import java.util.ArrayList;

public class Utils {
    public static ArrayList<Palabra> listaPalabras;

    public static ArrayList<Palabra> TodasLasPalabras(){
        return listaPalabras;
    };


    public static AbstractMap.SimpleEntry<ArrayList<Palabra>, ArrayList<Categoria>> CargarPalabras(){
        listaPalabras = new ArrayList<Palabra>();
        ArrayList<Categoria> listaCategoria = new ArrayList<Categoria>();

        Categoria Adjetivos = new Categoria("Adjetivos", R.drawable.categoria_adjetivo);
        listaCategoria.add(Adjetivos);

        listaPalabras.add(new Palabra("aburrido", "sentimiento de desinterés", R.drawable.aburrido, Adjetivos));
        listaPalabras.add(new Palabra("acido", "sabor como el limón", R.drawable.acido, Adjetivos));
        listaPalabras.add(new Palabra("adjetivos", "palabras que describen", R.drawable.adjetivos, Adjetivos));
        listaPalabras.add(new Palabra("agradable", "que agrada o complace", R.drawable.agradable, Adjetivos));
        listaPalabras.add(new Palabra("alegre", "sentimiento de felicidad", R.drawable.alegre, Adjetivos));
        listaPalabras.add(new Palabra("alto", "de gran altura", R.drawable.alto, Adjetivos));
        listaPalabras.add(new Palabra("amargo", "sabor no dulce ni salado", R.drawable.amargo, Adjetivos));
        listaPalabras.add(new Palabra("bajo", "poca altura o estatura", R.drawable.bajo, Adjetivos));
        listaPalabras.add(new Palabra("blando", "no duro ni firme", R.drawable.blando, Adjetivos));
        listaPalabras.add(new Palabra("bueno", "de calidad o beneficioso", R.drawable.bueno, Adjetivos));
        listaPalabras.add(new Palabra("caliente", "que tiene calor", R.drawable.caliente, Adjetivos));
        listaPalabras.add(new Palabra("castano", "color marrón claro", R.drawable.castano, Adjetivos));
        listaPalabras.add(new Palabra("claro", "fácil de entender o transparente", R.drawable.claro, Adjetivos));
        listaPalabras.add(new Palabra("contento", "sentimiento de satisfacción", R.drawable.contento, Adjetivos));
        listaPalabras.add(new Palabra("delgado", "sin mucho grosor o grasa", R.drawable.delgado, Adjetivos));
        listaPalabras.add(new Palabra("desagradable", "que desagrada", R.drawable.desagradable, Adjetivos));
        listaPalabras.add(new Palabra("diferente", "no igual o distinto", R.drawable.diferente, Adjetivos));
        listaPalabras.add(new Palabra("divertido", "que divierte o es gracioso", R.drawable.divertido, Adjetivos));
        listaPalabras.add(new Palabra("dulce", "sabor como el azúcar", R.drawable.dulce, Adjetivos));
        listaPalabras.add(new Palabra("duro", "firme al tacto", R.drawable.duro, Adjetivos));
        listaPalabras.add(new Palabra("enfadado", "molesto o irritado", R.drawable.enfadado, Adjetivos));
        listaPalabras.add(new Palabra("enfermo", "que tiene una enfermedad", R.drawable.enfermo, Adjetivos));
        listaPalabras.add(new Palabra("feo", "no agradable a la vista", R.drawable.feo, Adjetivos));
        listaPalabras.add(new Palabra("frio", "sin calor, baja temperatura", R.drawable.frio, Adjetivos));
        listaPalabras.add(new Palabra("gordo", "con exceso de peso o volumen", R.drawable.gordo, Adjetivos));
        listaPalabras.add(new Palabra("guapo", "agradable a la vista", R.drawable.guapo, Adjetivos));
        listaPalabras.add(new Palabra("igual", "sin diferencias", R.drawable.igual, Adjetivos));
        listaPalabras.add(new Palabra("lento", "que se mueve despacio", R.drawable.lento, Adjetivos));
        listaPalabras.add(new Palabra("limpio", "sin suciedad", R.drawable.limpio, Adjetivos));
        listaPalabras.add(new Palabra("lleno", "ocupado completamente", R.drawable.lleno, Adjetivos));
        listaPalabras.add(new Palabra("malo", "de mala calidad o dañino", R.drawable.malo, Adjetivos));
        listaPalabras.add(new Palabra("moreno", "de piel oscura o bronceada", R.drawable.moreno, Adjetivos));
        listaPalabras.add(new Palabra("mucho", "en gran cantidad", R.drawable.mucho, Adjetivos));
        listaPalabras.add(new Palabra("oscuro", "falta de luz", R.drawable.oscuro, Adjetivos));
        listaPalabras.add(new Palabra("pelirrojo", "con cabello de color rojo", R.drawable.pelirrojo, Adjetivos));
        listaPalabras.add(new Palabra("poco", "en pequeña cantidad", R.drawable.poco, Adjetivos));
        listaPalabras.add(new Palabra("primer", "que precede a todos los demás", R.drawable.primer, Adjetivos));
        listaPalabras.add(new Palabra("rapido", "que se mueve velozmente", R.drawable.rapido, Adjetivos));
        listaPalabras.add(new Palabra("rubio", "con cabello de color claro", R.drawable.rubio, Adjetivos));
        listaPalabras.add(new Palabra("salado", "con sabor a sal", R.drawable.salado, Adjetivos));
        listaPalabras.add(new Palabra("sano", "sin enfermedades", R.drawable.sano, Adjetivos));
        listaPalabras.add(new Palabra("sucio", "con impurezas o manchas", R.drawable.sucio, Adjetivos));
        listaPalabras.add(new Palabra("templado", "ni frío ni caliente", R.drawable.templado, Adjetivos));
        listaPalabras.add(new Palabra("triste", "sentimiento de pena", R.drawable.triste, Adjetivos));
        listaPalabras.add(new Palabra("ultimo", "que sigue a todos los demás", R.drawable.ultimo, Adjetivos));
        listaPalabras.add(new Palabra("vacio", "sin contenido o personas", R.drawable.vacio, Adjetivos));

        Categoria Adverbios = new Categoria("Adverbios", R.drawable.categoria_adverbio);
        listaCategoria.add(Adjetivos);

        listaPalabras.add(new Palabra("abajo", "direction towards a lower position", R.drawable.abajo, Adverbios));
        listaPalabras.add(new Palabra("adverbio", "word that modifies a verb, adjective, or other adverb", R.drawable.adverbio, Adverbios));
        listaPalabras.add(new Palabra("arriba", "direction towards a higher position", R.drawable.arriba, Adverbios));
        listaPalabras.add(new Palabra("bien", "in a satisfactory manner", R.drawable.bien, Adverbios));
        listaPalabras.add(new Palabra("cerca", "at a short distance away", R.drawable.cerca, Adverbios));
        listaPalabras.add(new Palabra("debajo", "in a position beneath something", R.drawable.debajo, Adverbios));
        listaPalabras.add(new Palabra("delante", "in front of", R.drawable.delante, Adverbios));
        listaPalabras.add(new Palabra("dentro", "inside of", R.drawable.dentro, Adverbios));
        listaPalabras.add(new Palabra("derecha", "towards or on the right side", R.drawable.derecha, Adverbios));
        listaPalabras.add(new Palabra("detras", "behind", R.drawable.detras, Adverbios));
        listaPalabras.add(new Palabra("encima", "on top of", R.drawable.encima, Adverbios));
        listaPalabras.add(new Palabra("fuera", "outside", R.drawable.fuera, Adverbios));
        listaPalabras.add(new Palabra("izquierda", "towards or on the left side", R.drawable.izquierda, Adverbios));
        listaPalabras.add(new Palabra("lejos", "at a distance", R.drawable.lejos, Adverbios));
        listaPalabras.add(new Palabra("mal", "in an unsatisfactory manner", R.drawable.mal, Adverbios));

        Categoria Verbos = new Categoria("Verbos", R.drawable.categoria_verbo);
        listaCategoria.add(Verbos);

        listaPalabras.add(new Palabra("abrazar", "acto de envolver con los brazos", R.drawable.abrazar, Verbos));
        listaPalabras.add(new Palabra("amar", "tener gran afecto", R.drawable.amar, Verbos));
        listaPalabras.add(new Palabra("andar", "moverse a pie", R.drawable.andar, Verbos));
        listaPalabras.add(new Palabra("aprender", "adquirir conocimiento", R.drawable.aprender, Verbos));
        listaPalabras.add(new Palabra("ayudar", "asistir o socorrer", R.drawable.ayudar, Verbos));
        listaPalabras.add(new Palabra("beber", "ingerir líquidos", R.drawable.beber, Verbos));
        listaPalabras.add(new Palabra("besar", "tocar con los labios", R.drawable.besar, Verbos));
        listaPalabras.add(new Palabra("comer", "ingerir alimentos", R.drawable.comer, Verbos));
        listaPalabras.add(new Palabra("comprar", "adquirir algo a cambio de dinero", R.drawable.comprar, Verbos));
        listaPalabras.add(new Palabra("conocer", "tener noticia de algo", R.drawable.conocer, Verbos));
        listaPalabras.add(new Palabra("contar", "enumerar o relatar", R.drawable.contar, Verbos));
        listaPalabras.add(new Palabra("correr", "desplazarse rápidamente", R.drawable.correr, Verbos));
        listaPalabras.add(new Palabra("cortar", "dividir algo usando algo afilado", R.drawable.cortar, Verbos));
        listaPalabras.add(new Palabra("crecer-planta", "aumentar de tamaño en plantas", R.drawable.crecer_planta, Verbos));
        listaPalabras.add(new Palabra("crecer", "aumentar de tamaño", R.drawable.crecer, Verbos));
        listaPalabras.add(new Palabra("descansar", "reposar para recuperarse", R.drawable.descansar, Verbos));
        listaPalabras.add(new Palabra("dormir", "estar en reposo cerrando los ojos", R.drawable.dormir, Verbos));
        listaPalabras.add(new Palabra("ducharse", "lavarse en la ducha", R.drawable.ducharse, Verbos));
        listaPalabras.add(new Palabra("entender", "comprender algo", R.drawable.entender, Verbos));
        listaPalabras.add(new Palabra("escribir", "representar palabras con letras", R.drawable.escribir, Verbos));
        listaPalabras.add(new Palabra("esperar", "quedarse en un lugar hasta que ocurra algo", R.drawable.esperar, Verbos));
        listaPalabras.add(new Palabra("explicar", "hacer entendible o claro algo", R.drawable.explicar, Verbos));
        listaPalabras.add(new Palabra("gritar", "hablar en un tono muy alto", R.drawable.gritar, Verbos));
        listaPalabras.add(new Palabra("gustar", "sentir agrado por algo", R.drawable.gustar, Verbos));
        listaPalabras.add(new Palabra("hablar-lse", "comunicarse usando lenguaje de señas", R.drawable.hablar_lse, Verbos));
        listaPalabras.add(new Palabra("hablar-oral", "comunicarse verbalmente", R.drawable.hablar_oral, Verbos));
        listaPalabras.add(new Palabra("jugar", "realizar actividades recreativas", R.drawable.jugar, Verbos));
        listaPalabras.add(new Palabra("lavar-la-cabeza", "limpiar el pelo y cuero cabelludo", R.drawable.lavar_la_cabeza, Verbos));
        listaPalabras.add(new Palabra("lavar-la-ropa", "limpiar las prendas de vestir", R.drawable.lavar_la_ropa, Verbos));
        listaPalabras.add(new Palabra("lavar-los-dientes", "limpiar los dientes con cepillo", R.drawable.lavar_los_dientes, Verbos));
        listaPalabras.add(new Palabra("leer", "interpretar lo escrito", R.drawable.leer, Verbos));
        listaPalabras.add(new Palabra("levantarse", "ponerse de pie desde una posición sentada o reclinada", R.drawable.levantarse, Verbos));
        listaPalabras.add(new Palabra("llorar", "derramar lágrimas por emoción", R.drawable.llorar, Verbos));
        listaPalabras.add(new Palabra("montar", "subirse a algo o alguien", R.drawable.montar, Verbos));
        listaPalabras.add(new Palabra("nacer", "venir al mundo", R.drawable.nacer, Verbos));
        listaPalabras.add(new Palabra("no-conocer", "no tener noticia de algo", R.drawable.no_conocer, Verbos));
        listaPalabras.add(new Palabra("no-gustar", "sentir desagrado por algo", R.drawable.no_gustar, Verbos));
        listaPalabras.add(new Palabra("no-tener", "carecer de algo", R.drawable. no_tener, Verbos));
        listaPalabras.add(new Palabra("oir", "percibir sonidos", R.drawable.oir, Verbos));
        listaPalabras.add(new Palabra("oler", "percibir olores", R.drawable.oler, Verbos));
        listaPalabras.add(new Palabra("pasear", "caminar con tranquilidad", R.drawable.pasear, Verbos));
        listaPalabras.add(new Palabra("patinar", "deslizarse sobre una superficie", R.drawable.patinar, Verbos));
        listaPalabras.add(new Palabra("pegar", "unir cosas con alguna sustancia o golpear", R.drawable.pegar, Verbos));
        listaPalabras.add(new Palabra("peinarse", "arreglar el cabello", R.drawable.peinarse, Verbos));
        listaPalabras.add(new Palabra("ponerse", "colocarse una prenda", R.drawable.ponerse, Verbos));
        listaPalabras.add(new Palabra("quitarse", "retirarse una prenda", R.drawable.quitarse, Verbos));
        listaPalabras.add(new Palabra("regalar", "dar algo a alguien", R.drawable.regalar, Verbos));
        listaPalabras.add(new Palabra("reir", "expresar alegría con la boca y rostro", R.drawable.reir, Verbos));
        listaPalabras.add(new Palabra("saborear", "percibir el sabor de algo", R.drawable.saborear, Verbos));
        listaPalabras.add(new Palabra("saltar", "elevarse del suelo con impulso", R.drawable.saltar, Verbos));
        listaPalabras.add(new Palabra("sentarse", "reposar el cuerpo sobre las nalgas", R.drawable.sentarse, Verbos));
        listaPalabras.add(new Palabra("tener", "poseer o contar con algo", R.drawable.tener, Verbos));
        listaPalabras.add(new Palabra("tocar", "poner la mano sobre algo", R.drawable.tocar, Verbos));
        listaPalabras.add(new Palabra("vamos-a", "propuesta de ir a un lugar", R.drawable.vamos_a, Verbos));
        listaPalabras.add(new Palabra("ver", "percibir con los ojos", R.drawable.ver, Verbos));
        listaPalabras.add(new Palabra("verbo", "palabras que expresan acción, estado o proceso", R.drawable.verbo, Verbos));
        listaPalabras.add(new Palabra("vestirse", "ponerse la ropa", R.drawable.vestirse, Verbos));
        listaPalabras.add(new Palabra("vivir", "tener vida o existir", R.drawable.vivir, Verbos));

        Categoria DiasSemana = new Categoria("Días de la semana", R.drawable.categoria_dia);
        listaCategoria.add(DiasSemana);

        listaPalabras.add(new Palabra("dia-de-la-semana", "cualquier día entre lunes y domingo", R.drawable.dia_de_la_semana, DiasSemana));
        listaPalabras.add(new Palabra("dia-manana", "el día que sigue al presente", R.drawable.dia_manana, DiasSemana));
        listaPalabras.add(new Palabra("domingo", "séptimo y último día de la semana", R.drawable.domingo, DiasSemana));
        listaPalabras.add(new Palabra("fin-de-semana", "periodo que comprende sábado y domingo", R.drawable.fin_de_semana, DiasSemana));
        listaPalabras.add(new Palabra("jueves", "quinto día de la semana", R.drawable.jueves, DiasSemana));
        listaPalabras.add(new Palabra("lunes", "primer día de la semana", R.drawable.lunes, DiasSemana));
        listaPalabras.add(new Palabra("martes", "segundo día de la semana", R.drawable.martes, DiasSemana));
        listaPalabras.add(new Palabra("miercoles", "tercer día de la semana", R.drawable.miercoles, DiasSemana));
        listaPalabras.add(new Palabra("sabado", "sexto día de la semana", R.drawable.sabado, DiasSemana));
        listaPalabras.add(new Palabra("semana", "periodo de siete días", R.drawable.semana, DiasSemana));
        listaPalabras.add(new Palabra("viernes", "cuarto día de la semana", R.drawable.viernes, DiasSemana));


        Categoria Estaciones = new Categoria("Estaciones", R.drawable.categoria_estacion);
        listaCategoria.add(Estaciones);

        listaPalabras.add(new Palabra("estaciones", "divisiones del año según condiciones climáticas", R.drawable.estaciones, Estaciones));
        listaPalabras.add(new Palabra("invierno", "estación más fría del año", R.drawable.invierno, Estaciones));
        listaPalabras.add(new Palabra("otono", "estación del año entre verano e invierno", R.drawable.otono, Estaciones));
        listaPalabras.add(new Palabra("primavera", "estación del año entre invierno y verano", R.drawable.primavera, Estaciones));
        listaPalabras.add(new Palabra("verano", "estación más cálida del año", R.drawable.verano, Estaciones));

        Categoria Fiestas = new Categoria("Fiestas", R.drawable.categoria_fiesta);
        listaCategoria.add(Fiestas);

        listaPalabras.add(new Palabra("cumpleanos", "celebración del aniversario del nacimiento", R.drawable.cumpleanos, Fiestas));
        listaPalabras.add(new Palabra("fiesta", "celebración o evento festivo", R.drawable.fiesta, Fiestas));
        listaPalabras.add(new Palabra("navidad", "festividad que celebra el nacimiento de Jesús", R.drawable.navidad, Fiestas));
        listaPalabras.add(new Palabra("papa-noel", "personaje legendario que trae regalos en Navidad", R.drawable.papanoel, Fiestas));
        listaPalabras.add(new Palabra("reyes-magos", "tres figuras que traen regalos el 6 de enero", R.drawable.reyesmagos, Fiestas));

        Categoria MesesDelAño = new Categoria("Meses del año", R.drawable.categoria_mes);
        listaCategoria.add(MesesDelAño);

        listaPalabras.add(new Palabra("calendario", "sistema para medir el tiempo", R.drawable.calendario, MesesDelAño));
        listaPalabras.add(new Palabra("diciembre", "duodécimo mes del año", R.drawable.diciembre, MesesDelAño));
        listaPalabras.add(new Palabra("junio", "sexto mes del año", R.drawable.junio, MesesDelAño));
        listaPalabras.add(new Palabra("mayo", "quinto mes del año", R.drawable.mayo, MesesDelAño));
        listaPalabras.add(new Palabra("mes", "unidad de tiempo de alrededor de 30 días", R.drawable.mes, MesesDelAño));
        listaPalabras.add(new Palabra("meses-del-ano", "conjunto de los doce períodos del año", R.drawable.mesesdelano, MesesDelAño));
        listaPalabras.add(new Palabra("noviembre", "undécimo mes del año", R.drawable.noviembre, MesesDelAño));
        listaPalabras.add(new Palabra("octubre", "décimo mes del año", R.drawable.octubre, MesesDelAño));
        listaPalabras.add(new Palabra("septiembre", "noveno mes del año", R.drawable.septiembre, MesesDelAño));

        Categoria Tiempo = new Categoria("Tiempo", R.drawable.categoria_tiempo);
        listaCategoria.add(Tiempo);

        listaPalabras.add(new Palabra("ayer", "día que precede al de hoy", R.drawable.ayer, Tiempo));
        listaPalabras.add(new Palabra("en-punto", "indicación exacta de una hora", R.drawable.enpunto, Tiempo));
        listaPalabras.add(new Palabra("hora-interrogativa", "pregunta sobre la hora", R.drawable.horainterrogativa, Tiempo));
        listaPalabras.add(new Palabra("hoy", "día en el que estamos", R.drawable.hoy, Tiempo));
        listaPalabras.add(new Palabra("la-hora-de", "momento específico del día", R.drawable.lahorade, Tiempo));
        listaPalabras.add(new Palabra("manana", "día siguiente al de hoy", R.drawable.manana, Tiempo));
        listaPalabras.add(new Palabra("menos-cuarto", "quince minutos antes de la hora", R.drawable.menoscuarto, Tiempo));
        listaPalabras.add(new Palabra("por-la-manana", "parte del día después del amanecer y antes del mediodía", R.drawable.porlamanana, Tiempo));
        listaPalabras.add(new Palabra("por-la-noche", "parte del día después del atardecer y antes del amanecer", R.drawable.porlanoche, Tiempo));
        listaPalabras.add(new Palabra("por-la-tarde", "parte del día después del mediodía y antes del atardecer", R.drawable.porlatarde, Tiempo));
        listaPalabras.add(new Palabra("tiempo", "duración de las cosas sujetas a cambio", R.drawable.tiempo, Tiempo));
        listaPalabras.add(new Palabra("y-cuarto", "quince minutos después de la hora", R.drawable.ycuarto, Tiempo));
        listaPalabras.add(new Palabra("y-media", "treinta minutos después de la hora", R.drawable.ymedia, Tiempo));

        Categoria Casa = new Categoria("Casa", R.drawable.categoria_casa);
        listaCategoria.add(Casa);

        listaPalabras.add(new Palabra("alfombra", "tela gruesa que se pone en el suelo", R.drawable.alfombra, Casa));
        listaPalabras.add(new Palabra("armario", "mueble con puertas donde se guardan cosas", R.drawable.armario, Casa));
        listaPalabras.add(new Palabra("bano", "habitación con bañera o ducha", R.drawable.bano, Casa));
        listaPalabras.add(new Palabra("cama", "mueble para dormir", R.drawable.cama, Casa));
        listaPalabras.add(new Palabra("casa", "edificio para vivir", R.drawable.casa, Casa));
        listaPalabras.add(new Palabra("cocina", "lugar donde se prepara la comida", R.drawable.cocina, Casa));
        listaPalabras.add(new Palabra("cristal", "material transparente usado en ventanas", R.drawable.cristal, Casa));
        listaPalabras.add(new Palabra("despertador", "reloj que suena a una hora determinada", R.drawable.despertador, Casa));
        listaPalabras.add(new Palabra("dormitorio", "habitación para dormir", R.drawable.dormitorio, Casa));
        listaPalabras.add(new Palabra("fax", "aparato para enviar documentos por línea telefónica", R.drawable.fax, Casa));
        listaPalabras.add(new Palabra("lampara", "objeto que proporciona luz", R.drawable.lampara, Casa));
        listaPalabras.add(new Palabra("maceta", "recipiente para plantas", R.drawable.maceta, Casa));
        listaPalabras.add(new Palabra("manta", "tela gruesa para abrigarse", R.drawable.manta, Casa));
        listaPalabras.add(new Palabra("maquina", "aparato para hacer algo específico", R.drawable.maquina, Casa));
        listaPalabras.add(new Palabra("mesilla", "mueble pequeño al lado de la cama", R.drawable.mesilla, Casa));
        listaPalabras.add(new Palabra("mueble", "objeto en una casa, como una silla o una mesa", R.drawable.mueble, Casa));
        listaPalabras.add(new Palabra("muneco", "figura pequeña que representa a una persona o animal", R.drawable.muneco, Casa));
        listaPalabras.add(new Palabra("objeto", "cosa material que se puede ver y tocar", R.drawable.objeto, Casa));
        listaPalabras.add(new Palabra("ordenador", "máquina electrónica para procesar datos", R.drawable.ordenador, Casa));
        listaPalabras.add(new Palabra("pelota", "esfera para jugar", R.drawable.pelota, Casa));
        listaPalabras.add(new Palabra("plancha", "aparato para alisar la ropa", R.drawable.plancha, Casa));
        listaPalabras.add(new Palabra("puerta", "estructura que da acceso a un lugar", R.drawable.puerta, Casa));
        listaPalabras.add(new Palabra("sabana", "tela que se pone en la cama", R.drawable.sabana, Casa));
        listaPalabras.add(new Palabra("salon", "habitación principal en una casa", R.drawable.salon, Casa));
        listaPalabras.add(new Palabra("silla", "mueble para sentarse", R.drawable.silla, Casa));
        listaPalabras.add(new Palabra("sofa", "mueble para sentarse con respaldo y brazos", R.drawable.sofa, Casa));
        listaPalabras.add(new Palabra("telefono", "aparato para hablar a distancia", R.drawable.telefono, Casa));
        listaPalabras.add(new Palabra("televisor", "aparato para ver programas", R.drawable.televisor, Casa));
        listaPalabras.add(new Palabra("ventana", "apertura en una pared para entrar luz y aire", R.drawable.ventana, Casa));
        listaPalabras.add(new Palabra("video", "sistema de grabación de imágenes y sonidos", R.drawable.video, Casa));

        Categoria ObjetosDeCocina = new Categoria("Objetos de cocina", R.drawable.categoria_cocina);
        listaCategoria.add(ObjetosDeCocina);

        listaPalabras.add(new Palabra("cacerola", "recipiente de cocina para cocer alimentos", R.drawable.cacerola, ObjetosDeCocina));
        listaPalabras.add(new Palabra("cocina", "lugar donde se prepara la comida", R.drawable.cocina, ObjetosDeCocina));
        listaPalabras.add(new Palabra("cuchara", "instrumento para tomar o servir alimentos líquidos o blandos", R.drawable.cuchara, ObjetosDeCocina));
        listaPalabras.add(new Palabra("cuchillo", "instrumento cortante con hoja y mango", R.drawable.cuchillo, ObjetosDeCocina));
        listaPalabras.add(new Palabra("jarra", "recipiente con asa para líquidos", R.drawable.jarra, ObjetosDeCocina));
        listaPalabras.add(new Palabra("lavadora", "máquina para lavar ropa", R.drawable.lavadora, ObjetosDeCocina));
        listaPalabras.add(new Palabra("nevera", "aparato eléctrico para conservar alimentos frescos", R.drawable.nevera, ObjetosDeCocina));
        listaPalabras.add(new Palabra("objetos", "cosas materiales que se pueden ver y tocar", R.drawable.objetos, ObjetosDeCocina));
        listaPalabras.add(new Palabra("plato", "pieza plana en que se sirve la comida", R.drawable.plato, ObjetosDeCocina));
        listaPalabras.add(new Palabra("sarten", "recipiente de cocina plano y con mango", R.drawable.sarten, ObjetosDeCocina));
        listaPalabras.add(new Palabra("servilleta", "tela o papel para limpiarse la boca y las manos", R.drawable.servilleta, ObjetosDeCocina));
        listaPalabras.add(new Palabra("tenedor", "instrumento para pinchar y llevar a la boca alimentos sólidos", R.drawable.tenedor, ObjetosDeCocina));
        listaPalabras.add(new Palabra("vaso", "recipiente para beber", R.drawable.vaso, ObjetosDeCocina));

        Categoria ObjetosDelBaño = new Categoria("Objetos del baño", R.drawable.categoria_bano);
        listaCategoria.add(ObjetosDelBaño);

        listaPalabras.add(new Palabra("banera", "recipiente grande para bañarse", R.drawable.banera, ObjetosDelBaño));
        listaPalabras.add(new Palabra("bano", "habitación con instalaciones para lavarse", R.drawable.bano, ObjetosDelBaño));
        listaPalabras.add(new Palabra("cepillo", "instrumento con cerdas para limpiar o peinar", R.drawable.cepillo, ObjetosDelBaño));
        listaPalabras.add(new Palabra("champu", "producto líquido para lavar el cabello", R.drawable.champu, ObjetosDelBaño));
        listaPalabras.add(new Palabra("colonia", "líquido con aroma para el cuerpo", R.drawable.colonia, ObjetosDelBaño));
        listaPalabras.add(new Palabra("espejo", "superficie reflectante para ver la imagen reflejada", R.drawable.espejo, ObjetosDelBaño));
        listaPalabras.add(new Palabra("esponja", "objeto poroso para limpiar o bañarse", R.drawable.esponja, ObjetosDelBaño));
        listaPalabras.add(new Palabra("jabon", "producto sólido o líquido para limpiar", R.drawable.jabon, ObjetosDelBaño));
        listaPalabras.add(new Palabra("lavabo", "pila para lavarse las manos y cara", R.drawable.lavabo, ObjetosDelBaño));
        listaPalabras.add(new Palabra("objetos", "cosas materiales que se pueden ver y tocar", R.drawable.objetos, ObjetosDelBaño));
        listaPalabras.add(new Palabra("papel", "material en hojas para escribir o limpiar", R.drawable.papel, ObjetosDelBaño));
        listaPalabras.add(new Palabra("pasta-de-dientes", "producto para limpiar los dientes", R.drawable.pastadedientes, ObjetosDelBaño));
        listaPalabras.add(new Palabra("peine", "instrumento con púas para ordenar el cabello", R.drawable.peine, ObjetosDelBaño));
        listaPalabras.add(new Palabra("toalla", "tela para secar el cuerpo o las manos", R.drawable.toalla, ObjetosDelBaño));

        Categoria MediosDeTransporte = new Categoria("Medios de transporte", R.drawable.categoria_transporte);
        listaCategoria.add(MediosDeTransporte);

        listaPalabras.add(new Palabra("ambulancia", "vehículo destinado a asistencia o emergencias médicas", R.drawable.ambulancia, MediosDeTransporte));
        listaPalabras.add(new Palabra("autobus", "vehículo grande de pasajeros para transporte público", R.drawable.autobus, MediosDeTransporte));
        listaPalabras.add(new Palabra("barca", "embarcación pequeña, generalmente con remos", R.drawable.barca, MediosDeTransporte));
        listaPalabras.add(new Palabra("bicicleta", "vehículo de dos ruedas impulsado por pedales", R.drawable.bicicleta, MediosDeTransporte));
        listaPalabras.add(new Palabra("camion", "vehículo grande para transporte de mercancías", R.drawable.camion, MediosDeTransporte));
        listaPalabras.add(new Palabra("coche", "vehículo automóvil de cuatro ruedas para transporte de personas", R.drawable.coche, MediosDeTransporte));
        listaPalabras.add(new Palabra("moto", "vehículo de dos ruedas, motorizado", R.drawable.moto, MediosDeTransporte));
        listaPalabras.add(new Palabra("transporte", "medio o sistema para llevar personas o cosas de un lugar a otro", R.drawable.transporte, MediosDeTransporte));
        listaPalabras.add(new Palabra("vehiculo", "medio de transporte terrestre, aéreo o acuático", R.drawable.vehiculo, MediosDeTransporte));


        Categoria Ciudad = new Categoria("Ciudad", R.drawable.categoria_ciudad);
        listaCategoria.add(Ciudad);

        listaPalabras.add(new Palabra("acera", "parte de la calle destinada para peatones", R.drawable.acera, Ciudad));
        listaPalabras.add(new Palabra("banco-dinero", "institución para depositar o pedir dinero", R.drawable.banco_dinero, Ciudad));
        listaPalabras.add(new Palabra("banco-sentar", "objeto para sentarse en lugares públicos", R.drawable.banco_sentar, Ciudad));
        listaPalabras.add(new Palabra("biblioteca", "lugar donde se conservan y prestan libros", R.drawable.biblioteca, Ciudad));
        listaPalabras.add(new Palabra("buzon", "caja para depositar cartas", R.drawable.buzon, Ciudad));
        listaPalabras.add(new Palabra("calle", "vía pública urbana", R.drawable.calle, Ciudad));
        listaPalabras.add(new Palabra("cine", "lugar para ver películas", R.drawable.cine, Ciudad));
        listaPalabras.add(new Palabra("ciudad", "conjunto grande de edificios y calles", R.drawable.ciudad, Ciudad));
        listaPalabras.add(new Palabra("colegio", "institución educativa", R.drawable.colegio, Ciudad));
        listaPalabras.add(new Palabra("columpio", "juego infantil que se balancea", R.drawable.columpio, Ciudad));
        listaPalabras.add(new Palabra("farola", "lámpara de calle", R.drawable.farola, Ciudad));
        listaPalabras.add(new Palabra("fuente", "construcción con agua que brota", R.drawable.fuente, Ciudad));
        listaPalabras.add(new Palabra("hospital", "lugar de atención médica", R.drawable.hospital, Ciudad));
        listaPalabras.add(new Palabra("libreria", "tienda de libros", R.drawable.libreria, Ciudad));
        listaPalabras.add(new Palabra("luz", "claridad que permite ver", R.drawable.luz, Ciudad));
        listaPalabras.add(new Palabra("museo", "lugar para conservar y exhibir obras", R.drawable.museo, Ciudad));
        listaPalabras.add(new Palabra("parque", "área verde para recreo", R.drawable.parque, Ciudad));
        listaPalabras.add(new Palabra("paso-de-cebra", "franjas para cruzar la calle", R.drawable.paso_de_cebra, Ciudad));
        listaPalabras.add(new Palabra("pasteleria", "tienda de pasteles", R.drawable.pasteleria, Ciudad));
        listaPalabras.add(new Palabra("plaza", "espacio público abierto", R.drawable.plaza, Ciudad));
        listaPalabras.add(new Palabra("puente", "construcción para pasar obstáculos", R.drawable.puente, Ciudad));
        listaPalabras.add(new Palabra("quiosco", "puesto pequeño de venta", R.drawable.quiosco, Ciudad));
        listaPalabras.add(new Palabra("semaforo", "dispositivo de control de tráfico", R.drawable.semaforo, Ciudad));
        listaPalabras.add(new Palabra("supermercado", "gran tienda de alimentos y otros productos", R.drawable.supermercado, Ciudad));
        listaPalabras.add(new Palabra("teatro", "lugar para representaciones", R.drawable.teatro, Ciudad));
        listaPalabras.add(new Palabra("tienda", "lugar donde se venden cosas", R.drawable.tienda, Ciudad));
        listaPalabras.add(new Palabra("tobogan", "juego deslizante", R.drawable.tobogan, Ciudad));
        listaPalabras.add(new Palabra("zapateria", "tienda de zapatos", R.drawable.zapateria, Ciudad));


        Categoria Profesiones = new Categoria("Profesiones", R.drawable.categoria_profesion);
        listaCategoria.add(Profesiones);

        listaPalabras.add(new Palabra("bombero", "persona que se dedica a extinguir incendios", R.drawable.bombero, Profesiones));
        listaPalabras.add(new Palabra("medico", "persona que practica la medicina y trata enfermedades", R.drawable.medico, Profesiones));
        listaPalabras.add(new Palabra("pastelero", "persona que se dedica a hacer pasteles y otros dulces", R.drawable.pastelero, Profesiones));
        listaPalabras.add(new Palabra("pescador", "persona que se dedica a la pesca", R.drawable.pescador, Profesiones));
        listaPalabras.add(new Palabra("policia", "miembro del cuerpo encargado de mantener el orden público", R.drawable.policia, Profesiones));
        listaPalabras.add(new Palabra("profesiones", "oficio, empleo u obra que alguien ejerce y por el que percibe una retribución", R.drawable.profesiones, Profesiones));
        listaPalabras.add(new Palabra("profesor", "persona que ejerce la docencia", R.drawable.profesor, Profesiones));
        listaPalabras.add(new Palabra("transporte", "medio en el que se lleva algo de un lugar a otro", R.drawable.transporte, Profesiones));

        Categoria Colegio = new Categoria("Colegio", R.drawable.categoria_colegio);
        listaCategoria.add(Colegio);

        listaPalabras.add(new Palabra("abecedario", "conjunto de letras de un idioma", R.drawable.abecedario, Colegio));
        listaPalabras.add(new Palabra("alumno", "persona que recibe enseñanza en un establecimiento educativo", R.drawable.alumno, Colegio));
        listaPalabras.add(new Palabra("clase", "lección que imparte un profesor", R.drawable.clase, Colegio));
        listaPalabras.add(new Palabra("colegio", "institución educativa para niños y jóvenes", R.drawable.colegio, Colegio));
        listaPalabras.add(new Palabra("dibujo", "representación gráfica de algo", R.drawable.dibujo, Colegio));
        listaPalabras.add(new Palabra("diferencia", "lo que distingue algo de otra cosa", R.drawable.diferencia, Colegio));
        listaPalabras.add(new Palabra("gramo", "unidad de peso", R.drawable.gramo, Colegio));
        listaPalabras.add(new Palabra("lenguajessignosespañola", "sistema de comunicación mediante signos para personas sordas", R.drawable.lenguajessignosespanola, Colegio));
        listaPalabras.add(new Palabra("litro", "unidad de volumen", R.drawable.litro, Colegio));
        listaPalabras.add(new Palabra("medida", "dimensión de algo", R.drawable.medida, Colegio));
        listaPalabras.add(new Palabra("metro", "unidad de longitud", R.drawable.metro, Colegio));
        listaPalabras.add(new Palabra("multiplicacion", "operación matemática de sumar un número tantas veces como indica otro número", R.drawable.multiplicacion, Colegio));
        listaPalabras.add(new Palabra("numero", "símbolo que indica una cantidad", R.drawable.numero, Colegio));
        listaPalabras.add(new Palabra("palabra", "conjunto de sonidos articulados que expresan una idea", R.drawable.palabra, Colegio));
        listaPalabras.add(new Palabra("patio", "espacio descubierto en un edificio", R.drawable.patio, Colegio));
        listaPalabras.add(new Palabra("resta", "operación matemática que consiste en quitar una cantidad a otra", R.drawable.resta, Colegio));
        listaPalabras.add(new Palabra("servicio", "acción y efecto de servir", R.drawable.servicio, Colegio));
        listaPalabras.add(new Palabra("suma", "operación matemática de juntar varias cantidades", R.drawable.suma, Colegio));

        Categoria Colores = new Categoria("Colores", R.drawable.categoria_color);
        listaCategoria.add(Colores);

        listaPalabras.add(new Palabra("amarillo", "color del sol o el oro", R.drawable.amarillo, Colores));
        listaPalabras.add(new Palabra("azul", "color del cielo despejado", R.drawable.azul, Colores));
        listaPalabras.add(new Palabra("blanco", "color de la leche o la nieve", R.drawable.blanco, Colores));
        listaPalabras.add(new Palabra("colores", "propiedad de los objetos definida por la luz que reflejan, transmiten o emiten", R.drawable.colores, Colores));
        listaPalabras.add(new Palabra("marron", "color de la tierra o la madera", R.drawable.marron, Colores));
        listaPalabras.add(new Palabra("naranja", "color de la fruta llamada naranja", R.drawable.naranja, Colores));
        listaPalabras.add(new Palabra("negro", "ausencia de color o luz", R.drawable.negro, Colores));
        listaPalabras.add(new Palabra("rojo", "color de la sangre o las amapolas", R.drawable.rojo, Colores));
        listaPalabras.add(new Palabra("rosa", "color de las flores de la planta del mismo nombre", R.drawable.rosa, Colores));
        listaPalabras.add(new Palabra("verde", "color de la hierba fresca", R.drawable.verde, Colores));

        Categoria FormasYTamaños = new Categoria("Formas y tamaños", R.drawable.categoria_forma);
        listaCategoria.add(FormasYTamaños);

        listaPalabras.add(new Palabra("circulo", "figura geométrica que es completamente redonda", R.drawable.circulo, FormasYTamaños));
        listaPalabras.add(new Palabra("cuadrado", "figura geométrica con cuatro lados iguales y cuatro ángulos rectos", R.drawable.cuadrado, FormasYTamaños));
        listaPalabras.add(new Palabra("formas-y-tamanos", "variedad de figuras y dimensiones", R.drawable.formas_y_tamanos, FormasYTamaños));
        listaPalabras.add(new Palabra("formas", "configuración exterior o contorno de algo", R.drawable.formas, FormasYTamaños));
        listaPalabras.add(new Palabra("grande", "de tamaño mayor que el usual o que otros de su misma especie", R.drawable.grande, FormasYTamaños));
        listaPalabras.add(new Palabra("mediano", "de tamaño medio o intermedio", R.drawable.mediano, FormasYTamaños));
        listaPalabras.add(new Palabra("pequeno", "de tamaño menor que el usual o que otros de su misma especie", R.drawable.pequeno, FormasYTamaños));
        listaPalabras.add(new Palabra("rectangulo", "figura geométrica con cuatro lados y cuatro ángulos rectos, pero sólo los lados opuestos son iguales entre sí", R.drawable.rectangulo, FormasYTamaños));
        listaPalabras.add(new Palabra("tamano", "dimensión o magnitud de algo", R.drawable.tamano, FormasYTamaños));
        listaPalabras.add(new Palabra("triangulo", "figura geométrica con tres lados y tres ángulos", R.drawable.triangulo, FormasYTamaños));

        Categoria ComidasYBebidas = new Categoria("Comidas y bebidas", R.drawable.categoria_comida);
        listaCategoria.add(ComidasYBebidas);

        listaPalabras.add(new Palabra("aceite", "líquido graso que se obtiene de algunas plantas, semillas o frutas", R.drawable.aceite, ComidasYBebidas));
        listaPalabras.add(new Palabra("agua", "líquido transparente e incoloro que se encuentra en la naturaleza", R.drawable.agua, ComidasYBebidas));
        listaPalabras.add(new Palabra("alimento", "sustancia que los seres vivos comen y beben para su subsistencia", R.drawable.alimento, ComidasYBebidas));
        listaPalabras.add(new Palabra("arroz", "grano que proviene de una planta herbácea", R.drawable.arroz, ComidasYBebidas));
        listaPalabras.add(new Palabra("azucar", "sustancia dulce que se extrae principalmente de la caña y de la remolacha", R.drawable.azucar, ComidasYBebidas));
        listaPalabras.add(new Palabra("bebida", "líquido que se puede beber", R.drawable.bebida, ComidasYBebidas));
        listaPalabras.add(new Palabra("bocadillo", "pan relleno de cualquier alimento", R.drawable.bocadillo, ComidasYBebidas));
        listaPalabras.add(new Palabra("caramelo", "dulce pequeño hecho a base de azúcar", R.drawable.caramelo, ComidasYBebidas));
        listaPalabras.add(new Palabra("carnes", "tejido muscular de los animales que se utiliza como alimento", R.drawable.carnes, ComidasYBebidas));
        listaPalabras.add(new Palabra("cebolla", "planta cuyo bulbo es comestible y tiene un sabor fuerte", R.drawable.cebolla, ComidasYBebidas));
        listaPalabras.add(new Palabra("cena", "última comida del día", R.drawable.cena, ComidasYBebidas));
        listaPalabras.add(new Palabra("chocolate", "pasta hecha con cacao y azúcar, que puede llevar leche o frutos secos", R.drawable.chocolate, ComidasYBebidas));
        listaPalabras.add(new Palabra("comida", "alimento que se toma al mediodía o a primera hora de la tarde", R.drawable.comida, ComidasYBebidas));
        listaPalabras.add(new Palabra("desayuno", "primera comida del día", R.drawable.desayuno, ComidasYBebidas));
        listaPalabras.add(new Palabra("galleta", "pastel seco y duro, hecho con harina, mantequilla y azúcar", R.drawable.galleta, ComidasYBebidas));
        listaPalabras.add(new Palabra("huevo", "cuerpo redondeado que producen las aves y que contiene el embrión", R.drawable.huevo, ComidasYBebidas));
        listaPalabras.add(new Palabra("leche", "líquido blanco que producen las hembras de los mamíferos", R.drawable.leche, ComidasYBebidas));
        listaPalabras.add(new Palabra("lechuga", "planta comestible de hojas verdes", R.drawable.lechuga, ComidasYBebidas));
        listaPalabras.add(new Palabra("limon", "fruto cítrico de forma ovalada y color amarillo", R.drawable.limon, ComidasYBebidas));
        listaPalabras.add(new Palabra("macarrones", "pasta alimenticia de forma tubular", R.drawable.macarrones, ComidasYBebidas));
        listaPalabras.add(new Palabra("merienda", "comida ligera que se hace a media tarde", R.drawable.merienda, ComidasYBebidas));
        listaPalabras.add(new Palabra("pan", "alimento básico hecho de masa de harina, agua y sal que se cuece al horno", R.drawable.pan, ComidasYBebidas));
        listaPalabras.add(new Palabra("patata", "tubérculo comestible de forma ovalada", R.drawable.patata, ComidasYBebidas));
        listaPalabras.add(new Palabra("pescado", "animal acuático que se utiliza como alimento", R.drawable.pescado, ComidasYBebidas));
        listaPalabras.add(new Palabra("pollo", "ave que se cría para su consumo", R.drawable.pollo, ComidasYBebidas));
        listaPalabras.add(new Palabra("pure", "preparación culinaria de consistencia blanda hecha de alimentos triturados", R.drawable.pure, ComidasYBebidas));
        listaPalabras.add(new Palabra("queso", "alimento sólido hecho con leche cuajada de vaca, oveja, cabra, etc.", R.drawable.queso, ComidasYBebidas));
        listaPalabras.add(new Palabra("sal", "sustancia blanca y cristalina que se utiliza para sazonar y conservar los alimentos", R.drawable.sal, ComidasYBebidas));
        listaPalabras.add(new Palabra("sed", "deseo de beber debido a la falta de líquidos en el cuerpo", R.drawable.sed, ComidasYBebidas));
        listaPalabras.add(new Palabra("sopa", "plato que se hace cociendo en un líquido carne, pescado, legumbres o verduras", R.drawable.sopa, ComidasYBebidas));
        listaPalabras.add(new Palabra("tomate", "fruto de color rojo anaranjado que se utiliza en la cocina", R.drawable.tomate, ComidasYBebidas));
        listaPalabras.add(new Palabra("zanahoria", "raíz comestible de color naranja", R.drawable.zanahoria, ComidasYBebidas));
        listaPalabras.add(new Palabra("zumo", "líquido que se extrae de un cuerpo, especialmente de una fruta", R.drawable.zumo, ComidasYBebidas));

        Categoria Cuerpo = new Categoria("Cuerpo", R.drawable.categoria_cuerpo);
        listaCategoria.add(Cuerpo);

        listaPalabras.add(new Palabra("boca", "orificio anterior del tubo digestivo de los animales, situado en la cabeza", R.drawable.boca, Cuerpo));
        listaPalabras.add(new Palabra("brazo", "extremidad superior del cuerpo humano que va desde el hombro hasta la mano", R.drawable.brazo, Cuerpo));
        listaPalabras.add(new Palabra("cabeza", "parte superior del cuerpo humano, y en muchos animales, en la que se encuentran el cerebro y varios órganos sensoriales", R.drawable.cabeza, Cuerpo));
        listaPalabras.add(new Palabra("cuerpo", "conjunto de las partes que componen el organismo de un ser humano o animal", R.drawable.cuerpo, Cuerpo));
        listaPalabras.add(new Palabra("culo", "parte trasera del cuerpo humano y de algunos animales situada entre el final de la espalda y el inicio de las piernas", R.drawable.culo, Cuerpo));
        listaPalabras.add(new Palabra("dedo", "cada una de las extremidades articuladas en que terminan las manos y los pies del ser humano y de muchos animales", R.drawable.dedo, Cuerpo));
        listaPalabras.add(new Palabra("dientes", "uno de los órganos duros, encajados en los alvéolos de la boca, con los que los vertebrados mastican", R.drawable.dientes, Cuerpo));
        listaPalabras.add(new Palabra("lengua", "órgano muscular situado en el interior de la boca, que sirve para gustar y ayudar a deglutir los alimentos y para hablar", R.drawable.lengua, Cuerpo));
        listaPalabras.add(new Palabra("mano", "extremidad del brazo humano que va desde la muñeca inclusive hasta la punta de los dedos", R.drawable.mano, Cuerpo));
        listaPalabras.add(new Palabra("nariz", "protuberancia de la cara humana situada entre la frente y la boca, en la que están los orificios nasales", R.drawable.nariz, Cuerpo));
        listaPalabras.add(new Palabra("ojo", "órgano del sentido de la vista en los seres vivos", R.drawable.ojo, Cuerpo));
        listaPalabras.add(new Palabra("oreja", "órgano de la audición y del equilibrio, situado a ambos lados de la cabeza", R.drawable.oreja, Cuerpo));
        listaPalabras.add(new Palabra("pelo", "filamento cilíndrico, delgado, de naturaleza córnea, que nace y crece entre los poros de la piel de muchos seres vivos", R.drawable.pelo, Cuerpo));
        listaPalabras.add(new Palabra("pene", "órgano externo del aparato reproductor masculino en los vertebrados", R.drawable.pene, Cuerpo));
        listaPalabras.add(new Palabra("pie", "extremidad de cada pierna del ser humano y de muchos animales, en la que se apoyan para andar", R.drawable.pie, Cuerpo));
        listaPalabras.add(new Palabra("pierna", "extremidad inferior del cuerpo humano, que va desde la cadera hasta el pie", R.drawable.pierna, Cuerpo));
        listaPalabras.add(new Palabra("vulva", "parte externa de los órganos genitales femeninos", R.drawable.vulva, Cuerpo));

        Categoria Sentidos = new Categoria("Sentidos", R.drawable.categoria_sentido);
        listaCategoria.add(Sentidos);

        listaPalabras.add(new Palabra("gusto", "sentido que permite percibir sabores a través de la lengua", R.drawable.gusto, Sentidos));
        listaPalabras.add(new Palabra("oido", "órgano responsable de detectar y procesar el sonido", R.drawable.oido, Sentidos));
        listaPalabras.add(new Palabra("olfato", "sentido que permite detectar y reconocer olores a través de la nariz", R.drawable.olfato, Sentidos));
        listaPalabras.add(new Palabra("sentidos", "capacidades que permiten a los organismos recibir y procesar información del entorno", R.drawable.sentidos, Sentidos));
        listaPalabras.add(new Palabra("tacto", "sentido que permite reconocer las cualidades de los objetos y seres vivos mediante el contacto", R.drawable.tacto, Sentidos));
        listaPalabras.add(new Palabra("vista", "sentido que permite percibir formas, colores y movimiento a través de los ojos", R.drawable.vista, Sentidos));

        Categoria Familia = new Categoria("Familia", R.drawable.categoria_familia);
        listaCategoria.add(Familia);

        listaPalabras.add(new Palabra("abuelo", "padre de uno de los padres de una persona", R.drawable.abuelo, Familia));
        listaPalabras.add(new Palabra("amigo", "persona a la que se estima y con la que se mantiene una relación de afecto o confianza", R.drawable.amigo, Familia));
        listaPalabras.add(new Palabra("bebe", "niño muy pequeño, especialmente si aún no ha aprendido a caminar", R.drawable.bebe, Familia));
        listaPalabras.add(new Palabra("ciego", "persona que no tiene capacidad de ver", R.drawable.ciego, Familia));
        listaPalabras.add(new Palabra("familia", "conjunto de personas emparentadas entre sí que viven juntas", R.drawable.familia, Familia));
        listaPalabras.add(new Palabra("hermano", "persona que tiene el mismo padre y madre, o solo el mismo padre o madre que otra", R.drawable.hermano, Familia));
        listaPalabras.add(new Palabra("mama", "mujer que ha dado a luz a una persona o animal", R.drawable.mama, Familia));
        listaPalabras.add(new Palabra("nina", "niña de corta edad", R.drawable.nina, Familia));
        listaPalabras.add(new Palabra("nino", "niño de corta edad", R.drawable.nino, Familia));
        listaPalabras.add(new Palabra("papa", "hombre que ha engendrado a una persona", R.drawable.papa, Familia));
        listaPalabras.add(new Palabra("persona", "ser humano considerado independientemente de su sexo, edad, profesión, etc.", R.drawable.persona, Familia));
        listaPalabras.add(new Palabra("primo", "hijo del hermano o hermana de una persona", R.drawable.primo, Familia));
        listaPalabras.add(new Palabra("sordo", "persona que no tiene capacidad de oír", R.drawable.sordo, Familia));
        listaPalabras.add(new Palabra("sordociego", "persona que no tiene capacidad de ver ni oír", R.drawable.sordociego, Familia));
        listaPalabras.add(new Palabra("tio", "hermano del padre o de la madre de una persona", R.drawable.tio, Familia));

        Categoria Animales = new Categoria("Animales", R.drawable.categoria_animal);
        listaCategoria.add(Animales);

        listaPalabras.add(new Palabra("abeja", "insecto volador, de color amarillo y negro, que produce miel y cera", R.drawable.abeja, Animales));
        listaPalabras.add(new Palabra("aguila", "ave rapaz de gran tamaño, con vista aguda y fuertes garras", R.drawable.aguila, Animales));
        listaPalabras.add(new Palabra("animal", "ser orgánico que vive, siente y se mueve por propio impulso", R.drawable.animal, Animales));
        listaPalabras.add(new Palabra("ballena", "mamífero marino de gran tamaño", R.drawable.ballena, Animales));
        listaPalabras.add(new Palabra("burro", "mamífero doméstico de la familia de los équidos", R.drawable.burro, Animales));
        listaPalabras.add(new Palabra("caballo", "mamífero équido, usado como animal de monta", R.drawable.caballo, Animales));
        listaPalabras.add(new Palabra("cabra", "mamífero rumiante de cuernos arqueados hacia atrás", R.drawable.cabra, Animales));
        listaPalabras.add(new Palabra("camello", "mamífero rumiante con dos jorobas en la espalda", R.drawable.camello, Animales));
        listaPalabras.add(new Palabra("cerdo", "mamífero doméstico de la familia de los suidos", R.drawable.cerdo, Animales));
        listaPalabras.add(new Palabra("cocodrilo", "reptil de gran tamaño con fuertes mandíbulas", R.drawable.cocodrilo, Animales));
        listaPalabras.add(new Palabra("conejo", "mamífero roedor de orejas largas", R.drawable.conejo, Animales));
        listaPalabras.add(new Palabra("delfin", "mamífero marino de cuerpo fusiforme", R.drawable.delfin, Animales));
        listaPalabras.add(new Palabra("elefante", "mamífero de gran tamaño con una trompa larga", R.drawable.elefante, Animales));
        listaPalabras.add(new Palabra("foca", "mamífero marino con cuerpo adaptado para la natación", R.drawable.foca, Animales));
        listaPalabras.add(new Palabra("gallina", "ave doméstica que pone huevos", R.drawable.gallina, Animales));
        listaPalabras.add(new Palabra("gato", "mamífero felino doméstico", R.drawable.gato, Animales));
        listaPalabras.add(new Palabra("granja", "lugar donde se crían animales", R.drawable.granja, Animales));
        listaPalabras.add(new Palabra("jirafa", "mamífero con un cuello muy largo", R.drawable.jirafa, Animales));
        listaPalabras.add(new Palabra("leon", "mamífero felino de gran tamaño", R.drawable.leon, Animales));
        listaPalabras.add(new Palabra("loro", "ave que puede imitar sonidos", R.drawable.loro, Animales));
        listaPalabras.add(new Palabra("mariposa", "insecto volador con alas de colores", R.drawable.mariposa, Animales));
        listaPalabras.add(new Palabra("mono", "mamífero primate no humano", R.drawable.mono, Animales));
        listaPalabras.add(new Palabra("oso", "mamífero carnívoro de gran tamaño", R.drawable.oso, Animales));
        listaPalabras.add(new Palabra("oveja", "mamífero rumiante doméstico", R.drawable.oveja, Animales));
        listaPalabras.add(new Palabra("pajaro", "ave pequeña que puede volar", R.drawable.pajaro, Animales));
        listaPalabras.add(new Palabra("pato", "ave acuática con patas palmeadas", R.drawable.pato, Animales));
        listaPalabras.add(new Palabra("perro", "mamífero carnívoro doméstico", R.drawable.perro, Animales));
        listaPalabras.add(new Palabra("tiburon", "pez marino carnívoro de gran tamaño", R.drawable.tiburon, Animales));
        listaPalabras.add(new Palabra("tigre", "mamífero felino de gran tamaño con rayas", R.drawable.tigre, Animales));
        listaPalabras.add(new Palabra("toro", "macho de la vaca", R.drawable.toro, Animales));
        listaPalabras.add(new Palabra("tortuga", "reptil de caparazón duro", R.drawable.tortuga, Animales));
        listaPalabras.add(new Palabra("vaca", "mamífero rumiante doméstico que produce leche", R.drawable.vaca, Animales));
        listaPalabras.add(new Palabra("zoo", "lugar donde se exhiben animales", R.drawable.zoo, Animales));

        Categoria Naturaleza = new Categoria("Naturaleza", R.drawable.categoria_naturaleza);
        listaCategoria.add(Naturaleza);

        listaPalabras.add(new Palabra("abeto", "árbol de hojas perennes con forma cónica", R.drawable.abeto, Naturaleza));
        listaPalabras.add(new Palabra("arbol", "planta perenne de tronco leñoso y elevado", R.drawable.arbol, Naturaleza));
        listaPalabras.add(new Palabra("arco-iris", "fenómeno óptico con un espectro de colores en el cielo", R.drawable.arco_iris, Naturaleza));
        listaPalabras.add(new Palabra("arena", "material granulado y fino que se encuentra en playas y desiertos", R.drawable.arena, Naturaleza));
        listaPalabras.add(new Palabra("estrella", "cuerpo celeste que emite luz propia", R.drawable.estrella, Naturaleza));
        listaPalabras.add(new Palabra("faro", "torre con una luz brillante que guía a los barcos", R.drawable.faro, Naturaleza));
        listaPalabras.add(new Palabra("flor", "parte reproductiva de las plantas con colores y formas variadas", R.drawable.flor, Naturaleza));
        listaPalabras.add(new Palabra("flotador", "objeto que ayuda a flotar en el agua", R.drawable.flotador, Naturaleza));
        listaPalabras.add(new Palabra("fuego", "fenómeno de combustión que produce luz y calor", R.drawable.fuego, Naturaleza));
        listaPalabras.add(new Palabra("hierba", "planta verde y pequeña que cubre el suelo", R.drawable.hierba, Naturaleza));
        listaPalabras.add(new Palabra("hoja", "parte plana y verde de las plantas", R.drawable.hoja, Naturaleza));
        listaPalabras.add(new Palabra("lago", "cuerpo de agua dulce rodeado de tierra", R.drawable.lago, Naturaleza));
        listaPalabras.add(new Palabra("luna", "satélite natural de la Tierra que brilla en el cielo nocturno", R.drawable.luna, Naturaleza));
        listaPalabras.add(new Palabra("mar", "masa de agua salada que cubre gran parte de la Tierra", R.drawable.mar, Naturaleza));
        listaPalabras.add(new Palabra("margarita", "flor blanca con un centro amarillo", R.drawable.margarita, Naturaleza));
        listaPalabras.add(new Palabra("montana", "elevación natural y grande del terreno", R.drawable.montana, Naturaleza));
        listaPalabras.add(new Palabra("naturaleza", "todo lo que compone el universo físico y no es hecho por el ser humano", R.drawable.naturaleza, Naturaleza));
        listaPalabras.add(new Palabra("palmera", "árbol tropical con un tronco largo y hojas en la parte superior", R.drawable.palmera, Naturaleza));
        listaPalabras.add(new Palabra("piedra", "sustancia mineral dura y compacta", R.drawable.piedra, Naturaleza));
        listaPalabras.add(new Palabra("playa", "zona de tierra junto al mar o un lago con arena o piedras", R.drawable.playa, Naturaleza));
        listaPalabras.add(new Palabra("pozo", "excavación en la tierra para extraer agua", R.drawable.pozo, Naturaleza));
        listaPalabras.add(new Palabra("rio", "corriente de agua que fluye hacia el mar", R.drawable.rio, Naturaleza));
        listaPalabras.add(new Palabra("saco-de-dormir", "bolsa acolchada para dormir, especialmente al aire libre", R.drawable.saco_de_dormir, Naturaleza));
        listaPalabras.add(new Palabra("sombrilla", "objeto que proporciona sombra, especialmente en la playa", R.drawable.sombrilla, Naturaleza));
        listaPalabras.add(new Palabra("tienda-campana", "refugio portátil hecho de tela utilizado para acampar", R.drawable.tienda_campana, Naturaleza));

        Categoria TiempoAtmosférico = new Categoria("Tiempo atmosférico", R.drawable.categoria_tiempo_atmosferico);
        listaCategoria.add(TiempoAtmosférico);

        listaPalabras.add(new Palabra("calor", "sensación de alta temperatura", R.drawable.calor, TiempoAtmosférico));
        listaPalabras.add(new Palabra("frio", "sensación de baja temperatura", R.drawable.frio, TiempoAtmosférico));
        listaPalabras.add(new Palabra("lluvia", "agua que cae del cielo en gotas", R.drawable.lluvia, TiempoAtmosférico));
        listaPalabras.add(new Palabra("nieve", "precipitación de agua congelada en forma de cristales blancos", R.drawable.nieve, TiempoAtmosférico));
        listaPalabras.add(new Palabra("nube", "masa visible de gotas de agua o cristales de hielo en la atmósfera", R.drawable.nube, TiempoAtmosférico));
        listaPalabras.add(new Palabra("nublado", "estado del cielo cuando está cubierto de nubes", R.drawable.nublado, TiempoAtmosférico));
        listaPalabras.add(new Palabra("sol", "estrella que proporciona luz y calor a la Tierra", R.drawable.sol, TiempoAtmosférico));
        listaPalabras.add(new Palabra("tiempo-atmosferico", "condiciones del ambiente en un lugar y momento determinado", R.drawable.tiempo_atmosferico, TiempoAtmosférico));
        listaPalabras.add(new Palabra("tormenta", "perturbación atmosférica con vientos fuertes, lluvia, truenos y relámpagos", R.drawable.tormenta, TiempoAtmosférico));
        listaPalabras.add(new Palabra("viento", "movimiento del aire en la atmósfera", R.drawable.viento, TiempoAtmosférico));

        Categoria Ropa = new Categoria("Ropa", R.drawable.categoria_ropa);
        listaCategoria.add(Ropa);

        listaPalabras.add(new Palabra("abrigo", "prenda de vestir que cubre el cuerpo y se usa para abrigarse del frío", R.drawable.abrigo, Ropa));
        listaPalabras.add(new Palabra("banador-chica", "prenda de vestir diseñada para mujeres y usada para nadar", R.drawable.banador_chica, Ropa));
        listaPalabras.add(new Palabra("banador-chico", "prenda de vestir diseñada para hombres y usada para nadar", R.drawable.banador_chico, Ropa));
        listaPalabras.add(new Palabra("braga", "prenda interior femenina", R.drawable.braga, Ropa));
        listaPalabras.add(new Palabra("bufanda", "prenda de vestir alrededor del cuello para abrigarse del frío", R.drawable.bufanda, Ropa));
        listaPalabras.add(new Palabra("calzoncillo", "prenda interior masculina", R.drawable.calzoncillo, Ropa));
        listaPalabras.add(new Palabra("camisa", "prenda de vestir con botones que cubre el torso", R.drawable.camisa, Ropa));
        listaPalabras.add(new Palabra("chandal", "ropa deportiva que incluye pantalón y chaqueta o sudadera", R.drawable.chandal, Ropa));
        listaPalabras.add(new Palabra("gafas", "accesorio que se coloca frente a los ojos para mejorar la vista o protegerlos", R.drawable.gafas, Ropa));
        listaPalabras.add(new Palabra("gorra", "prenda que se usa para cubrir la cabeza", R.drawable.gorra, Ropa));
        listaPalabras.add(new Palabra("jersey", "prenda de vestir tejida que cubre el torso y los brazos", R.drawable.jersey, Ropa));
        listaPalabras.add(new Palabra("mochila", "bolso que se lleva en la espalda para transportar objetos", R.drawable.mochila, Ropa));
        listaPalabras.add(new Palabra("pantalon", "prenda de vestir que cubre desde la cintura hasta los tobillos", R.drawable.pantalon, Ropa));
        listaPalabras.add(new Palabra("pijama", "ropa cómoda para dormir", R.drawable.pijama, Ropa));
        listaPalabras.add(new Palabra("reloj", "instrumento para medir el tiempo que se lleva en la muñeca", R.drawable.reloj, Ropa));
        listaPalabras.add(new Palabra("ropa", "prenda de vestir", R.drawable.ropa, Ropa));
        listaPalabras.add(new Palabra("zapatilla", "tipo de calzado ligero y cómodo", R.drawable.zapatilla, Ropa));
        listaPalabras.add(new Palabra("zapato", "prenda que cubre el pie", R.drawable.zapato, Ropa));


        Categoria SaludosYPreguntas = new Categoria("Saludos y preguntas", R.drawable.categoria_saludo);
        listaCategoria.add(SaludosYPreguntas);

        listaPalabras.add(new Palabra("como-se-dice", "interrogación para conocer la traducción de una palabra", R.drawable.como_se_dice, SaludosYPreguntas));
        listaPalabras.add(new Palabra("como-se-signa", "interrogación para conocer el signo de una palabra", R.drawable.como_se_signa, SaludosYPreguntas));
        listaPalabras.add(new Palabra("como", "interrogación sobre el método o manera", R.drawable.como, SaludosYPreguntas));
        listaPalabras.add(new Palabra("cual", "interrogación sobre una elección o identificación", R.drawable.cual, SaludosYPreguntas));
        //listaPalabras.add(new Palabra("cuando-pasado", "interrogación sobre un momento en el pasado", R.drawable.cuando_pasado, SaludosYPreguntas));
        listaPalabras.add(new Palabra("cuando-presente-y-futuro", "interrogación sobre un momento en el presente o futuro", R.drawable.cuando_presente_y_futuro, SaludosYPreguntas));
        listaPalabras.add(new Palabra("cuanto", "interrogación sobre la cantidad", R.drawable.cuanto, SaludosYPreguntas));
        listaPalabras.add(new Palabra("donde", "interrogación sobre un lugar", R.drawable.donde, SaludosYPreguntas));
        listaPalabras.add(new Palabra("para-que", "interrogación sobre el propósito o razón", R.drawable.para_que, SaludosYPreguntas));
        listaPalabras.add(new Palabra("por-que", "interrogación sobre la razón o motivo", R.drawable.por_que, SaludosYPreguntas));
        listaPalabras.add(new Palabra("preguntas", "interrogaciones generales", R.drawable.preguntas, SaludosYPreguntas));
        listaPalabras.add(new Palabra("que-dia-es", "interrogación sobre la fecha actual", R.drawable.que_dia_es, SaludosYPreguntas));
        listaPalabras.add(new Palabra("que-dice", "interrogación sobre lo que alguien ha dicho", R.drawable.que_dice, SaludosYPreguntas));
        listaPalabras.add(new Palabra("que-tal", "interrogación sobre el bienestar o estado de alguien", R.drawable.que_tal, SaludosYPreguntas));
        listaPalabras.add(new Palabra("que", "interrogación general", R.drawable.que, SaludosYPreguntas));
        listaPalabras.add(new Palabra("quien", "interrogación sobre la identidad de alguien", R.drawable.quien, SaludosYPreguntas));
        listaPalabras.add(new Palabra("si-o-no", "interrogación binaria", R.drawable.si_o_no, SaludosYPreguntas));
        listaPalabras.add(new Palabra("adios", "expresión de despedida", R.drawable.adios, SaludosYPreguntas));
        listaPalabras.add(new Palabra("buenas-noches", "saludo para la noche", R.drawable.buenas_noches, SaludosYPreguntas));
        listaPalabras.add(new Palabra("buenas-tardes", "saludo para la tarde", R.drawable.buenas_tardes, SaludosYPreguntas));
        listaPalabras.add(new Palabra("buenos-dias", "saludo para la mañana", R.drawable.buenos_dias, SaludosYPreguntas));
        listaPalabras.add(new Palabra("cortesia", "expresión de cortesía o educación", R.drawable.cortesia, SaludosYPreguntas));
        listaPalabras.add(new Palabra("cuidado", "advertencia o alerta", R.drawable.cuidado, SaludosYPreguntas));
        listaPalabras.add(new Palabra("de-nada", "respuesta a un agradecimiento", R.drawable.de_nada, SaludosYPreguntas));
        listaPalabras.add(new Palabra("gracias", "expresión de agradecimiento", R.drawable.gracias, SaludosYPreguntas));
        listaPalabras.add(new Palabra("hola", "saludo general", R.drawable.hola, SaludosYPreguntas));
        listaPalabras.add(new Palabra("no", "negación", R.drawable.no, SaludosYPreguntas));
        listaPalabras.add(new Palabra("nombre", "identificador de una persona o cosa", R.drawable.nombre, SaludosYPreguntas));
        listaPalabras.add(new Palabra("por-favor", "expresión de cortesía para hacer una solicitud", R.drawable.por_favor, SaludosYPreguntas));
        listaPalabras.add(new Palabra("saludo", "acción o expresión de saludar", R.drawable.saludo, SaludosYPreguntas));
        listaPalabras.add(new Palabra("si", "afirmación", R.drawable.si, SaludosYPreguntas));
        listaPalabras.add(new Palabra("signo", "símbolo o marca", R.drawable.signo, SaludosYPreguntas));

        Categoria Postres = new Categoria("Postres", R.drawable.categoria_postre);
        listaCategoria.add(Postres);

        listaPalabras.add(new Palabra("dulce", "alimento o sabor azucarado", R.drawable.dulce, Postres));
        listaPalabras.add(new Palabra("flan", "postre cremoso a base de huevos y leche", R.drawable.flan, Postres));
        listaPalabras.add(new Palabra("fresa", "fruta roja y dulce", R.drawable.fresa, Postres));
        listaPalabras.add(new Palabra("fruta", "producto comestible obtenido de plantas", R.drawable.fruta, Postres));
        listaPalabras.add(new Palabra("helado", "postre congelado hecho de leche y sabores", R.drawable.helado, Postres));
        listaPalabras.add(new Palabra("manzana", "fruta redonda y de varios colores", R.drawable.manzana, Postres));
        listaPalabras.add(new Palabra("naranja", "fruta cítrica de color naranja", R.drawable.naranja, Postres));
        listaPalabras.add(new Palabra("pera", "fruta verde o amarilla de forma alargada", R.drawable.pera, Postres));
        listaPalabras.add(new Palabra("platano", "fruta amarilla y alargada", R.drawable.platano, Postres));
        listaPalabras.add(new Palabra("postre", "alimento dulce que se come después de la comida principal", R.drawable.postre, Postres));
        listaPalabras.add(new Palabra("sandia", "fruta grande y jugosa de color verde por fuera y rojo por dentro", R.drawable.sandia, Postres));
        listaPalabras.add(new Palabra("tarta", "postre hecho de masa con relleno o cobertura", R.drawable.tarta, Postres));
        listaPalabras.add(new Palabra("uva", "fruta pequeña y redonda, generalmente morada o verde", R.drawable.uva, Postres));

        Categoria CosasDelColegio = new Categoria("Cosas del Colegio", R.drawable.categoria_colegio);
        listaCategoria.add(CosasDelColegio);

        listaPalabras.add(new Palabra("boligrafo", "instrumento para escribir con tinta", R.drawable.boligrafo, CosasDelColegio));
        listaPalabras.add(new Palabra("borrador", "objeto para eliminar marcas de lápiz", R.drawable.borrador, CosasDelColegio));
        listaPalabras.add(new Palabra("cera", "material usado para colorear", R.drawable.cera, CosasDelColegio));
        listaPalabras.add(new Palabra("cosas-del-colegio", "objetos relacionados con la escuela", R.drawable.cosas_del_colegio, CosasDelColegio));
        listaPalabras.add(new Palabra("cosas", "objetos en general", R.drawable.cosas, CosasDelColegio));
        listaPalabras.add(new Palabra("cuaderno", "libro de papel para escribir", R.drawable.cuaderno, CosasDelColegio));
        listaPalabras.add(new Palabra("cuento", "historia corta", R.drawable.cuento, CosasDelColegio));
        listaPalabras.add(new Palabra("diccionario", "libro de definiciones de palabras", R.drawable.diccionario, CosasDelColegio));
        listaPalabras.add(new Palabra("goma", "objeto para borrar marcas", R.drawable.goma, CosasDelColegio));
        listaPalabras.add(new Palabra("hoja", "papel individual para escribir", R.drawable.hoja, CosasDelColegio));
        listaPalabras.add(new Palabra("lapices-de-colores", "conjunto de lápices de diferentes colores", R.drawable.lapices_de_colores, CosasDelColegio));
        listaPalabras.add(new Palabra("lapiz", "instrumento para escribir o dibujar", R.drawable.lapiz, CosasDelColegio));
        listaPalabras.add(new Palabra("libro", "conjunto de hojas impresas", R.drawable.libro, CosasDelColegio));
        listaPalabras.add(new Palabra("papel", "material para escribir o imprimir", R.drawable.papel, CosasDelColegio));
        listaPalabras.add(new Palabra("papelera", "contenedor para desechar papel", R.drawable.papelera, CosasDelColegio));
        listaPalabras.add(new Palabra("pegamento", "sustancia para unir objetos", R.drawable.pegamento, CosasDelColegio));
        listaPalabras.add(new Palabra("pintura", "material líquido para colorear", R.drawable.pintura, CosasDelColegio));
        listaPalabras.add(new Palabra("pizarra", "superficie para escribir con tiza", R.drawable.pizarra, CosasDelColegio));
        listaPalabras.add(new Palabra("plastilina", "material moldeable usado para modelar", R.drawable.plastilina, CosasDelColegio));
        listaPalabras.add(new Palabra("rotulador", "instrumento para escribir con tinta de colores", R.drawable.rotulador, CosasDelColegio));
        listaPalabras.add(new Palabra("sacapuntas", "instrumento para afilar lápices", R.drawable.sacapuntas, CosasDelColegio));
        listaPalabras.add(new Palabra("tijeras", "instrumento para cortar", R.drawable.tijeras, CosasDelColegio));
        listaPalabras.add(new Palabra("tiza", "material para escribir en pizarras", R.drawable.tiza, CosasDelColegio));
        
        return new AbstractMap.SimpleEntry<>(listaPalabras, listaCategoria);
    }
}
