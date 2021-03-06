package sg.edu.nus.comp.cs3219r.application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import sg.edu.nus.comp.cs3219r.Utils;
import sg.edu.nus.comp.cs3219r.templateView.CmdDir;
import sg.edu.nus.comp.cs3219r.templateView.Markdown;
import sg.edu.nus.comp.cs3219r.templateView.Template;
import sg.edu.nus.comp.cs3219r.templateView.TemplateHelper;
import sg.edu.nus.comp.cs3219r.templateView.Title;

/**
 * State of the application, will be saved through the momento pattern as
 * commands execute on it.
 * 
 * @author
 *
 */
public class AppState extends Observable {

	private CmdDir cmdDir;
	private Markdown markdown;
	private Title title;

	public AppState(String appName) throws IOException {
		this.cmdDir = new CmdDir(appName);
		this.markdown = new Markdown(Utils.markdownIds());
		this.title = new Title(appName);
		this.setChanged();
	}

	public CmdDir getCmdDir() {
		this.setChanged();
		return cmdDir;
	}

	public Markdown getMarkdown() {
		this.setChanged();
		return markdown;
	}

	public Title getTitle() {
		this.setChanged();
		return title;
	}

}
