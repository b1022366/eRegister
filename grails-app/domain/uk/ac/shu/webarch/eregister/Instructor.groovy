package uk.ac.shu.webarch.eregister

class Instructor {
static mappedBy = [classes: 'instructor']

  static hasMany = [classes: RegClass]

    static constraints = {

    }
}
