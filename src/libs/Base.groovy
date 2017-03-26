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
    this.ctx.println("""
      the info: ${this.ctx.env.BRANCH_NAME}
      CHANGE_ID: ${this.ctx.CHANGE_ID}
      CHANGE_URL: ${CHANGE_URL}
CHANGE_TITLE: ${CHANGE_TITLE}
CHANGE_AUTHOR: ${CHANGE_AUTHOR}
CHANGE_AUTHOR_DISPLAY_NAME: ${CHANGE_AUTHOR_DISPLAY_NAME}
CHANGE_AUTHOR_EMAIL: ${CHANGE_AUTHOR_EMAIL}
CHANGE_TARGET: ${CHANGE_TARGET}
WORKSPACE: ${WORKSPACE}
    """)
  }

  void deploy() {
    if (this.orgName == 'ohralathe') {
      this.ctx.println("Run the deploy steps from shared libs")
    } else {
      this.ctx.println("Don't run the deploy steps from shared libs")
    }
  }
}