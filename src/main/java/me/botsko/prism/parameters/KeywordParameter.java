package me.botsko.prism.parameters;

import me.botsko.prism.actionlibs.QueryParameters;
import me.botsko.prism.actionlibs.QuerySession;

import org.bukkit.command.CommandSender;

import java.util.regex.Pattern;

public class KeywordParameter extends SimplePrismParameterHandler {

    /**
	 * 
	 */
    public KeywordParameter() {
        super( "Keyword", Pattern.compile( "[^\\s]+" ), "k" );
    }

    /**
	 * 
	 */
    @Override
    public void process( QuerySession session, String alias, String input ) {
        session.getQuery().setKeyword( input );
    }
}