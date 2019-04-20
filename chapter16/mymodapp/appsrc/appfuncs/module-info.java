// Module definition for the functions module.
module appfuncs {

  requires transitive appsupport;
  // Exports the package appfuncs.simplefuncs.
  exports appfuncs.simplefuncs to appstart, appfuncs;
}
