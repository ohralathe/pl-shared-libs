/**
 * Created by hoanvo on 3/26/17.
 */
package libs

class Base implements Serializable {
  def ctx
  String orgName

  Base(paramsMap) {
    this.ctx = paramsMap.ctx
    this.orgName = paramsMap.orgName
  }

  void build() {
    this.ctx.println("Run the build steps from shared libs")
  }

  void deploy() {
    if (this.orgName == 'ohralathe') {
      this.ctx.println("Run the deploy steps from shared libs")
    } else {
      this.ctx.println("Don't run the deploy steps from shared libs")
    }
  }
}