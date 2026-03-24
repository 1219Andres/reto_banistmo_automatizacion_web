#language: es
Característica: Gestión de documentos legales de FATCA y CRS
  Como un usuario interesado en las normativas bancarias internacionales
  Quiero acceder a la documentación de autocertificación de Banistmo
  Para asegurar el cumplimiento de los requisitos legales de mi entidad

  @RetoTecnico
  Escenario: Obtención del formulario de autocertificación para personas jurídicas
    Dado que el "Banistmo" se encuentra en el portal institucional de Banistmo
    Cuando solicita el documento de autocertificación unificado para personas jurídicas
    Entonces debería visualizar el formulario legal en formato PDF correctamente