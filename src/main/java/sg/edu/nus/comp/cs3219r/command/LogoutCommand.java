package sg.edu.nus.comp.cs3219r.command;

import sg.edu.nus.comp.cs3219r.application.AppState;

public class LogoutCommand extends Command {

  public LogoutCommand() {
    super("Logout", "logout", "hello");
    this.setHidden(true);
  }

  @Override
  public void execute(AppState state, String... parameters) {
    state.getCmdDir().get("login").setHidden(false);
    state.getCmdDir().get("goto").setHidden(true);
    this.setHidden(true);
  }

}
