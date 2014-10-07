// This file was generated by Mendix Business Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package oauthmodule.actions;

import oauthmodule.actions.custom.OauthCallback;
import com.mendix.core.Core;
import com.mendix.externalinterface.connector.RequestHandler;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

/**
 * 
 */
public class JA_SiginCallBackRH extends CustomJavaAction<Boolean>
{
	private String contextpath;

	public JA_SiginCallBackRH(IContext context, String contextpath)
	{
		super(context);
		this.contextpath = contextpath;
	}

	@Override
	public Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		RequestHandler requestHandler = new OauthCallback(contextpath);
		Core.addRequestHandler(contextpath, requestHandler);
		Core.getLogger("OauthCallback").info("Registered OAuth callback request handler at context path: "+ contextpath);

		return Boolean.TRUE;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public String toString()
	{
		return "JA_SiginCallBackRH";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}
