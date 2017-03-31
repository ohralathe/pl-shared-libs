/**
 * Created by hoanvo on 3/26/17.
 */
package libs

class Base implements Serializable {
  def ctx
  String orgName
  boolean stageErrors = false

  Base(paramsMap) {
    this.ctx = paramsMap.ctx
    this.orgName = paramsMap.orgName
  }

  void build() {
    this.ctx.println("Run the build steps from shared libs")
    this.ctx.println("""
      the info: ${this.ctx.env.BRANCH_NAME}
      CHANGE_ID: ${this.ctx.env.CHANGE_ID}
      CHANGE_URL: ${this.ctx.env.CHANGE_URL}
      CHANGE_TITLE: ${this.ctx.env.CHANGE_TITLE}
      CHANGE_AUTHOR: ${this.ctx.env.CHANGE_AUTHOR}
      CHANGE_AUTHOR_DISPLAY_NAME: ${this.ctx.env.CHANGE_AUTHOR_DISPLAY_NAME}
      CHANGE_AUTHOR_EMAIL: ${this.ctx.env.CHANGE_AUTHOR_EMAIL}
      CHANGE_TARGET: ${this.ctx.env.CHANGE_TARGET}
      WORKSPACE: ${this.ctx.env.WORKSPACE}
    """)
  }

  void deploy() {
    if (this.orgName == 'ohralathe') {
      this.ctx.println("Run the deploy steps from shared libs")
    } else {
      this.ctx.println("Don't run the deploy steps from shared libs")
    }

    this.stageErrors = true
  }
}