package fr.ema.dedal.xtext.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.ema.dedal.xtext.services.DedalADLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDedalADLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_REVISION_NUMB", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'dedal_diagram'", "'architecture_descriptions'", "'('", "';'", "')'", "'repositories'", "'repository'", "'components'", "'interface_types'", "'type'", "'signatures'", "'signature'", "'name'", "'parameters'", "'parameter'", "'specification'", "'component_roles'", "'connections'", "'versionID'", "'pre_version'", "'by'", "'component_role'", "'id'", "'required_interfaces'", "'provided_interfaces'", "'MinInstanceNbr'", "'MaxInstanceNbr'", "'interactions'", "'interface'", "'interface_direction'", "'implementation'", "'delegation'", "'instantiates'", "'connection'", "'client'", "'.'", "'server'", "'configuration'", "'implements'", "'component_classes'", "'connector_classes'", "'as'", "'component_types'", "'configConnections'", "'component_type'", "'primitive_component_class'", "'content'", "'attributes'", "'interfaces'", "'composite_component_class'", "'delegated_interfaces'", "'realizes'", "'delegated_old'", "'provided'", "'required'", "'['", "']'", "'connector_type'", "'connector'", "'class_connection'", "'property'", "'port'", "','", "'composite_port'", "'ports'", "'assembly'", "'instance_of'", "'component_instances'", "'assembly_constraints'", "'assembly_connections'", "'expression'", "'component_instance'", "'component_interfaces'", "'instance_connection'", "'!'", "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'='", "'change'", "'time'", "'level'", "'operation'", "'artifact'", "'is'", "'purpose'", "'origin'", "'from'", "'static'", "'dynamic'", "'addition'", "'removal'", "'substitution'", "'modification'", "'architecture_behavior'", "'component_class'", "'connector_class'", "'connector_instance'", "'assembly_constraint'", "'corrective'", "'perfective'", "'adaptative'", "'given'", "'generated'", "'propagated'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int RULE_REVISION_NUMB=6;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int RULE_INT=7;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__120=120;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalDedalADLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDedalADLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDedalADLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDedalADL.g"; }



     	private DedalADLGrammarAccess grammarAccess;
     	
        public InternalDedalADLParser(TokenStream input, DedalADLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "DedalDiagram";	
       	}
       	
       	@Override
       	protected DedalADLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDedalDiagram"
    // InternalDedalADL.g:68:1: entryRuleDedalDiagram returns [EObject current=null] : iv_ruleDedalDiagram= ruleDedalDiagram EOF ;
    public final EObject entryRuleDedalDiagram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDedalDiagram = null;


        try {
            // InternalDedalADL.g:69:2: (iv_ruleDedalDiagram= ruleDedalDiagram EOF )
            // InternalDedalADL.g:70:2: iv_ruleDedalDiagram= ruleDedalDiagram EOF
            {
             newCompositeNode(grammarAccess.getDedalDiagramRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDedalDiagram=ruleDedalDiagram();

            state._fsp--;

             current =iv_ruleDedalDiagram; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDedalDiagram"


    // $ANTLR start "ruleDedalDiagram"
    // InternalDedalADL.g:77:1: ruleDedalDiagram returns [EObject current=null] : (otherlv_0= 'dedal_diagram' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= 'architecture_descriptions' otherlv_3= '(' ( (lv_architectureDescriptions_4_0= ruleArchitectureDescription ) ) (otherlv_5= ';' ( (lv_architectureDescriptions_6_0= ruleArchitectureDescription ) ) )* otherlv_7= ')' )? (otherlv_8= 'repositories' otherlv_9= '(' ( (lv_repositories_10_0= ruleRepository ) ) (otherlv_11= ';' ( (lv_repositories_12_0= ruleRepository ) ) )* otherlv_13= ')' )? ) ) ;
    public final EObject ruleDedalDiagram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_architectureDescriptions_4_0 = null;

        EObject lv_architectureDescriptions_6_0 = null;

        EObject lv_repositories_10_0 = null;

        EObject lv_repositories_12_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:80:28: ( (otherlv_0= 'dedal_diagram' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= 'architecture_descriptions' otherlv_3= '(' ( (lv_architectureDescriptions_4_0= ruleArchitectureDescription ) ) (otherlv_5= ';' ( (lv_architectureDescriptions_6_0= ruleArchitectureDescription ) ) )* otherlv_7= ')' )? (otherlv_8= 'repositories' otherlv_9= '(' ( (lv_repositories_10_0= ruleRepository ) ) (otherlv_11= ';' ( (lv_repositories_12_0= ruleRepository ) ) )* otherlv_13= ')' )? ) ) )
            // InternalDedalADL.g:81:1: (otherlv_0= 'dedal_diagram' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= 'architecture_descriptions' otherlv_3= '(' ( (lv_architectureDescriptions_4_0= ruleArchitectureDescription ) ) (otherlv_5= ';' ( (lv_architectureDescriptions_6_0= ruleArchitectureDescription ) ) )* otherlv_7= ')' )? (otherlv_8= 'repositories' otherlv_9= '(' ( (lv_repositories_10_0= ruleRepository ) ) (otherlv_11= ';' ( (lv_repositories_12_0= ruleRepository ) ) )* otherlv_13= ')' )? ) )
            {
            // InternalDedalADL.g:81:1: (otherlv_0= 'dedal_diagram' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= 'architecture_descriptions' otherlv_3= '(' ( (lv_architectureDescriptions_4_0= ruleArchitectureDescription ) ) (otherlv_5= ';' ( (lv_architectureDescriptions_6_0= ruleArchitectureDescription ) ) )* otherlv_7= ')' )? (otherlv_8= 'repositories' otherlv_9= '(' ( (lv_repositories_10_0= ruleRepository ) ) (otherlv_11= ';' ( (lv_repositories_12_0= ruleRepository ) ) )* otherlv_13= ')' )? ) )
            // InternalDedalADL.g:81:3: otherlv_0= 'dedal_diagram' ( (lv_name_1_0= ruleEString ) ) ( (otherlv_2= 'architecture_descriptions' otherlv_3= '(' ( (lv_architectureDescriptions_4_0= ruleArchitectureDescription ) ) (otherlv_5= ';' ( (lv_architectureDescriptions_6_0= ruleArchitectureDescription ) ) )* otherlv_7= ')' )? (otherlv_8= 'repositories' otherlv_9= '(' ( (lv_repositories_10_0= ruleRepository ) ) (otherlv_11= ';' ( (lv_repositories_12_0= ruleRepository ) ) )* otherlv_13= ')' )? )
            {
            otherlv_0=(Token)match(input,12,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getDedalDiagramAccess().getDedal_diagramKeyword_0());
                
            // InternalDedalADL.g:85:1: ( (lv_name_1_0= ruleEString ) )
            // InternalDedalADL.g:86:1: (lv_name_1_0= ruleEString )
            {
            // InternalDedalADL.g:86:1: (lv_name_1_0= ruleEString )
            // InternalDedalADL.g:87:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDedalDiagramAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDedalDiagramRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:103:2: ( (otherlv_2= 'architecture_descriptions' otherlv_3= '(' ( (lv_architectureDescriptions_4_0= ruleArchitectureDescription ) ) (otherlv_5= ';' ( (lv_architectureDescriptions_6_0= ruleArchitectureDescription ) ) )* otherlv_7= ')' )? (otherlv_8= 'repositories' otherlv_9= '(' ( (lv_repositories_10_0= ruleRepository ) ) (otherlv_11= ';' ( (lv_repositories_12_0= ruleRepository ) ) )* otherlv_13= ')' )? )
            // InternalDedalADL.g:103:3: (otherlv_2= 'architecture_descriptions' otherlv_3= '(' ( (lv_architectureDescriptions_4_0= ruleArchitectureDescription ) ) (otherlv_5= ';' ( (lv_architectureDescriptions_6_0= ruleArchitectureDescription ) ) )* otherlv_7= ')' )? (otherlv_8= 'repositories' otherlv_9= '(' ( (lv_repositories_10_0= ruleRepository ) ) (otherlv_11= ';' ( (lv_repositories_12_0= ruleRepository ) ) )* otherlv_13= ')' )?
            {
            // InternalDedalADL.g:103:3: (otherlv_2= 'architecture_descriptions' otherlv_3= '(' ( (lv_architectureDescriptions_4_0= ruleArchitectureDescription ) ) (otherlv_5= ';' ( (lv_architectureDescriptions_6_0= ruleArchitectureDescription ) ) )* otherlv_7= ')' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDedalADL.g:103:5: otherlv_2= 'architecture_descriptions' otherlv_3= '(' ( (lv_architectureDescriptions_4_0= ruleArchitectureDescription ) ) (otherlv_5= ';' ( (lv_architectureDescriptions_6_0= ruleArchitectureDescription ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,13,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_2, grammarAccess.getDedalDiagramAccess().getArchitecture_descriptionsKeyword_2_0_0());
                        
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_6); 

                        	newLeafNode(otherlv_3, grammarAccess.getDedalDiagramAccess().getLeftParenthesisKeyword_2_0_1());
                        
                    // InternalDedalADL.g:111:1: ( (lv_architectureDescriptions_4_0= ruleArchitectureDescription ) )
                    // InternalDedalADL.g:112:1: (lv_architectureDescriptions_4_0= ruleArchitectureDescription )
                    {
                    // InternalDedalADL.g:112:1: (lv_architectureDescriptions_4_0= ruleArchitectureDescription )
                    // InternalDedalADL.g:113:3: lv_architectureDescriptions_4_0= ruleArchitectureDescription
                    {
                     
                    	        newCompositeNode(grammarAccess.getDedalDiagramAccess().getArchitectureDescriptionsArchitectureDescriptionParserRuleCall_2_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_architectureDescriptions_4_0=ruleArchitectureDescription();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDedalDiagramRule());
                    	        }
                           		add(
                           			current, 
                           			"architectureDescriptions",
                            		lv_architectureDescriptions_4_0, 
                            		"fr.ema.dedal.xtext.DedalADL.ArchitectureDescription");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:129:2: (otherlv_5= ';' ( (lv_architectureDescriptions_6_0= ruleArchitectureDescription ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDedalADL.g:129:4: otherlv_5= ';' ( (lv_architectureDescriptions_6_0= ruleArchitectureDescription ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_6); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getDedalDiagramAccess().getSemicolonKeyword_2_0_3_0());
                    	        
                    	    // InternalDedalADL.g:133:1: ( (lv_architectureDescriptions_6_0= ruleArchitectureDescription ) )
                    	    // InternalDedalADL.g:134:1: (lv_architectureDescriptions_6_0= ruleArchitectureDescription )
                    	    {
                    	    // InternalDedalADL.g:134:1: (lv_architectureDescriptions_6_0= ruleArchitectureDescription )
                    	    // InternalDedalADL.g:135:3: lv_architectureDescriptions_6_0= ruleArchitectureDescription
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDedalDiagramAccess().getArchitectureDescriptionsArchitectureDescriptionParserRuleCall_2_0_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_architectureDescriptions_6_0=ruleArchitectureDescription();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDedalDiagramRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"architectureDescriptions",
                    	            		lv_architectureDescriptions_6_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.ArchitectureDescription");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_8); 

                        	newLeafNode(otherlv_7, grammarAccess.getDedalDiagramAccess().getRightParenthesisKeyword_2_0_4());
                        

                    }
                    break;

            }

            // InternalDedalADL.g:155:3: (otherlv_8= 'repositories' otherlv_9= '(' ( (lv_repositories_10_0= ruleRepository ) ) (otherlv_11= ';' ( (lv_repositories_12_0= ruleRepository ) ) )* otherlv_13= ')' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDedalADL.g:155:5: otherlv_8= 'repositories' otherlv_9= '(' ( (lv_repositories_10_0= ruleRepository ) ) (otherlv_11= ';' ( (lv_repositories_12_0= ruleRepository ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,17,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_8, grammarAccess.getDedalDiagramAccess().getRepositoriesKeyword_2_1_0());
                        
                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_9); 

                        	newLeafNode(otherlv_9, grammarAccess.getDedalDiagramAccess().getLeftParenthesisKeyword_2_1_1());
                        
                    // InternalDedalADL.g:163:1: ( (lv_repositories_10_0= ruleRepository ) )
                    // InternalDedalADL.g:164:1: (lv_repositories_10_0= ruleRepository )
                    {
                    // InternalDedalADL.g:164:1: (lv_repositories_10_0= ruleRepository )
                    // InternalDedalADL.g:165:3: lv_repositories_10_0= ruleRepository
                    {
                     
                    	        newCompositeNode(grammarAccess.getDedalDiagramAccess().getRepositoriesRepositoryParserRuleCall_2_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_repositories_10_0=ruleRepository();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDedalDiagramRule());
                    	        }
                           		add(
                           			current, 
                           			"repositories",
                            		lv_repositories_10_0, 
                            		"fr.ema.dedal.xtext.DedalADL.Repository");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:181:2: (otherlv_11= ';' ( (lv_repositories_12_0= ruleRepository ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalDedalADL.g:181:4: otherlv_11= ';' ( (lv_repositories_12_0= ruleRepository ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_9); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getDedalDiagramAccess().getSemicolonKeyword_2_1_3_0());
                    	        
                    	    // InternalDedalADL.g:185:1: ( (lv_repositories_12_0= ruleRepository ) )
                    	    // InternalDedalADL.g:186:1: (lv_repositories_12_0= ruleRepository )
                    	    {
                    	    // InternalDedalADL.g:186:1: (lv_repositories_12_0= ruleRepository )
                    	    // InternalDedalADL.g:187:3: lv_repositories_12_0= ruleRepository
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getDedalDiagramAccess().getRepositoriesRepositoryParserRuleCall_2_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_repositories_12_0=ruleRepository();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getDedalDiagramRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"repositories",
                    	            		lv_repositories_12_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.Repository");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_13, grammarAccess.getDedalDiagramAccess().getRightParenthesisKeyword_2_1_4());
                        

                    }
                    break;

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDedalDiagram"


    // $ANTLR start "entryRuleArchitectureDescription"
    // InternalDedalADL.g:215:1: entryRuleArchitectureDescription returns [EObject current=null] : iv_ruleArchitectureDescription= ruleArchitectureDescription EOF ;
    public final EObject entryRuleArchitectureDescription() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArchitectureDescription = null;


        try {
            // InternalDedalADL.g:216:2: (iv_ruleArchitectureDescription= ruleArchitectureDescription EOF )
            // InternalDedalADL.g:217:2: iv_ruleArchitectureDescription= ruleArchitectureDescription EOF
            {
             newCompositeNode(grammarAccess.getArchitectureDescriptionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleArchitectureDescription=ruleArchitectureDescription();

            state._fsp--;

             current =iv_ruleArchitectureDescription; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArchitectureDescription"


    // $ANTLR start "ruleArchitectureDescription"
    // InternalDedalADL.g:224:1: ruleArchitectureDescription returns [EObject current=null] : (this_Specification_0= ruleSpecification | this_Configuration_1= ruleConfiguration | this_Assembly_2= ruleAssembly ) ;
    public final EObject ruleArchitectureDescription() throws RecognitionException {
        EObject current = null;

        EObject this_Specification_0 = null;

        EObject this_Configuration_1 = null;

        EObject this_Assembly_2 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:227:28: ( (this_Specification_0= ruleSpecification | this_Configuration_1= ruleConfiguration | this_Assembly_2= ruleAssembly ) )
            // InternalDedalADL.g:228:1: (this_Specification_0= ruleSpecification | this_Configuration_1= ruleConfiguration | this_Assembly_2= ruleAssembly )
            {
            // InternalDedalADL.g:228:1: (this_Specification_0= ruleSpecification | this_Configuration_1= ruleConfiguration | this_Assembly_2= ruleAssembly )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt5=1;
                }
                break;
            case 49:
                {
                alt5=2;
                }
                break;
            case 77:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalDedalADL.g:229:5: this_Specification_0= ruleSpecification
                    {
                     
                            newCompositeNode(grammarAccess.getArchitectureDescriptionAccess().getSpecificationParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Specification_0=ruleSpecification();

                    state._fsp--;

                     
                            current = this_Specification_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:239:5: this_Configuration_1= ruleConfiguration
                    {
                     
                            newCompositeNode(grammarAccess.getArchitectureDescriptionAccess().getConfigurationParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Configuration_1=ruleConfiguration();

                    state._fsp--;

                     
                            current = this_Configuration_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalDedalADL.g:249:5: this_Assembly_2= ruleAssembly
                    {
                     
                            newCompositeNode(grammarAccess.getArchitectureDescriptionAccess().getAssemblyParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Assembly_2=ruleAssembly();

                    state._fsp--;

                     
                            current = this_Assembly_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArchitectureDescription"


    // $ANTLR start "entryRuleComponent"
    // InternalDedalADL.g:265:1: entryRuleComponent returns [EObject current=null] : iv_ruleComponent= ruleComponent EOF ;
    public final EObject entryRuleComponent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponent = null;


        try {
            // InternalDedalADL.g:266:2: (iv_ruleComponent= ruleComponent EOF )
            // InternalDedalADL.g:267:2: iv_ruleComponent= ruleComponent EOF
            {
             newCompositeNode(grammarAccess.getComponentRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComponent=ruleComponent();

            state._fsp--;

             current =iv_ruleComponent; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponent"


    // $ANTLR start "ruleComponent"
    // InternalDedalADL.g:274:1: ruleComponent returns [EObject current=null] : (this_CompRole_0= ruleCompRole | this_CompClass_Impl_1= ruleCompClass_Impl | this_CompInstance_2= ruleCompInstance | this_CompositeCompClass_3= ruleCompositeCompClass | this_CompType_4= ruleCompType ) ;
    public final EObject ruleComponent() throws RecognitionException {
        EObject current = null;

        EObject this_CompRole_0 = null;

        EObject this_CompClass_Impl_1 = null;

        EObject this_CompInstance_2 = null;

        EObject this_CompositeCompClass_3 = null;

        EObject this_CompType_4 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:277:28: ( (this_CompRole_0= ruleCompRole | this_CompClass_Impl_1= ruleCompClass_Impl | this_CompInstance_2= ruleCompInstance | this_CompositeCompClass_3= ruleCompositeCompClass | this_CompType_4= ruleCompType ) )
            // InternalDedalADL.g:278:1: (this_CompRole_0= ruleCompRole | this_CompClass_Impl_1= ruleCompClass_Impl | this_CompInstance_2= ruleCompInstance | this_CompositeCompClass_3= ruleCompositeCompClass | this_CompType_4= ruleCompType )
            {
            // InternalDedalADL.g:278:1: (this_CompRole_0= ruleCompRole | this_CompClass_Impl_1= ruleCompClass_Impl | this_CompInstance_2= ruleCompInstance | this_CompositeCompClass_3= ruleCompositeCompClass | this_CompType_4= ruleCompType )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt6=1;
                }
                break;
            case 57:
                {
                alt6=2;
                }
                break;
            case 83:
                {
                alt6=3;
                }
                break;
            case 61:
                {
                alt6=4;
                }
                break;
            case 56:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalDedalADL.g:279:5: this_CompRole_0= ruleCompRole
                    {
                     
                            newCompositeNode(grammarAccess.getComponentAccess().getCompRoleParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CompRole_0=ruleCompRole();

                    state._fsp--;

                     
                            current = this_CompRole_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:289:5: this_CompClass_Impl_1= ruleCompClass_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getComponentAccess().getCompClass_ImplParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CompClass_Impl_1=ruleCompClass_Impl();

                    state._fsp--;

                     
                            current = this_CompClass_Impl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalDedalADL.g:299:5: this_CompInstance_2= ruleCompInstance
                    {
                     
                            newCompositeNode(grammarAccess.getComponentAccess().getCompInstanceParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CompInstance_2=ruleCompInstance();

                    state._fsp--;

                     
                            current = this_CompInstance_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // InternalDedalADL.g:309:5: this_CompositeCompClass_3= ruleCompositeCompClass
                    {
                     
                            newCompositeNode(grammarAccess.getComponentAccess().getCompositeCompClassParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CompositeCompClass_3=ruleCompositeCompClass();

                    state._fsp--;

                     
                            current = this_CompositeCompClass_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // InternalDedalADL.g:319:5: this_CompType_4= ruleCompType
                    {
                     
                            newCompositeNode(grammarAccess.getComponentAccess().getCompTypeParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CompType_4=ruleCompType();

                    state._fsp--;

                     
                            current = this_CompType_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponent"


    // $ANTLR start "entryRuleCompClass"
    // InternalDedalADL.g:335:1: entryRuleCompClass returns [EObject current=null] : iv_ruleCompClass= ruleCompClass EOF ;
    public final EObject entryRuleCompClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompClass = null;


        try {
            // InternalDedalADL.g:336:2: (iv_ruleCompClass= ruleCompClass EOF )
            // InternalDedalADL.g:337:2: iv_ruleCompClass= ruleCompClass EOF
            {
             newCompositeNode(grammarAccess.getCompClassRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompClass=ruleCompClass();

            state._fsp--;

             current =iv_ruleCompClass; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompClass"


    // $ANTLR start "ruleCompClass"
    // InternalDedalADL.g:344:1: ruleCompClass returns [EObject current=null] : (this_CompClass_Impl_0= ruleCompClass_Impl | this_CompositeCompClass_1= ruleCompositeCompClass ) ;
    public final EObject ruleCompClass() throws RecognitionException {
        EObject current = null;

        EObject this_CompClass_Impl_0 = null;

        EObject this_CompositeCompClass_1 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:347:28: ( (this_CompClass_Impl_0= ruleCompClass_Impl | this_CompositeCompClass_1= ruleCompositeCompClass ) )
            // InternalDedalADL.g:348:1: (this_CompClass_Impl_0= ruleCompClass_Impl | this_CompositeCompClass_1= ruleCompositeCompClass )
            {
            // InternalDedalADL.g:348:1: (this_CompClass_Impl_0= ruleCompClass_Impl | this_CompositeCompClass_1= ruleCompositeCompClass )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==57) ) {
                alt7=1;
            }
            else if ( (LA7_0==61) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalDedalADL.g:349:5: this_CompClass_Impl_0= ruleCompClass_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getCompClassAccess().getCompClass_ImplParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CompClass_Impl_0=ruleCompClass_Impl();

                    state._fsp--;

                     
                            current = this_CompClass_Impl_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:359:5: this_CompositeCompClass_1= ruleCompositeCompClass
                    {
                     
                            newCompositeNode(grammarAccess.getCompClassAccess().getCompositeCompClassParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CompositeCompClass_1=ruleCompositeCompClass();

                    state._fsp--;

                     
                            current = this_CompositeCompClass_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompClass"


    // $ANTLR start "entryRuleInteraction"
    // InternalDedalADL.g:375:1: entryRuleInteraction returns [EObject current=null] : iv_ruleInteraction= ruleInteraction EOF ;
    public final EObject entryRuleInteraction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInteraction = null;


        try {
            // InternalDedalADL.g:376:2: (iv_ruleInteraction= ruleInteraction EOF )
            // InternalDedalADL.g:377:2: iv_ruleInteraction= ruleInteraction EOF
            {
             newCompositeNode(grammarAccess.getInteractionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInteraction=ruleInteraction();

            state._fsp--;

             current =iv_ruleInteraction; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteraction"


    // $ANTLR start "ruleInteraction"
    // InternalDedalADL.g:384:1: ruleInteraction returns [EObject current=null] : (this_Interface_0= ruleInterface | this_Port_Impl_1= rulePort_Impl | this_CompositePort_2= ruleCompositePort ) ;
    public final EObject ruleInteraction() throws RecognitionException {
        EObject current = null;

        EObject this_Interface_0 = null;

        EObject this_Port_Impl_1 = null;

        EObject this_CompositePort_2 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:387:28: ( (this_Interface_0= ruleInterface | this_Port_Impl_1= rulePort_Impl | this_CompositePort_2= ruleCompositePort ) )
            // InternalDedalADL.g:388:1: (this_Interface_0= ruleInterface | this_Port_Impl_1= rulePort_Impl | this_CompositePort_2= ruleCompositePort )
            {
            // InternalDedalADL.g:388:1: (this_Interface_0= ruleInterface | this_Port_Impl_1= rulePort_Impl | this_CompositePort_2= ruleCompositePort )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt8=1;
                }
                break;
            case 73:
                {
                alt8=2;
                }
                break;
            case 75:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalDedalADL.g:389:5: this_Interface_0= ruleInterface
                    {
                     
                            newCompositeNode(grammarAccess.getInteractionAccess().getInterfaceParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Interface_0=ruleInterface();

                    state._fsp--;

                     
                            current = this_Interface_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:399:5: this_Port_Impl_1= rulePort_Impl
                    {
                     
                            newCompositeNode(grammarAccess.getInteractionAccess().getPort_ImplParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Port_Impl_1=rulePort_Impl();

                    state._fsp--;

                     
                            current = this_Port_Impl_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalDedalADL.g:409:5: this_CompositePort_2= ruleCompositePort
                    {
                     
                            newCompositeNode(grammarAccess.getInteractionAccess().getCompositePortParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CompositePort_2=ruleCompositePort();

                    state._fsp--;

                     
                            current = this_CompositePort_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteraction"


    // $ANTLR start "entryRuleEString"
    // InternalDedalADL.g:427:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDedalADL.g:428:2: (iv_ruleEString= ruleEString EOF )
            // InternalDedalADL.g:429:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDedalADL.g:436:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:439:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDedalADL.g:440:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDedalADL.g:440:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalDedalADL.g:440:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:448:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleRepository"
    // InternalDedalADL.g:463:1: entryRuleRepository returns [EObject current=null] : iv_ruleRepository= ruleRepository EOF ;
    public final EObject entryRuleRepository() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRepository = null;


        try {
            // InternalDedalADL.g:464:2: (iv_ruleRepository= ruleRepository EOF )
            // InternalDedalADL.g:465:2: iv_ruleRepository= ruleRepository EOF
            {
             newCompositeNode(grammarAccess.getRepositoryRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRepository=ruleRepository();

            state._fsp--;

             current =iv_ruleRepository; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRepository"


    // $ANTLR start "ruleRepository"
    // InternalDedalADL.g:472:1: ruleRepository returns [EObject current=null] : (otherlv_0= 'repository' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'components' otherlv_3= '(' ( (lv_components_4_0= ruleComponent ) ) (otherlv_5= ';' ( (lv_components_6_0= ruleComponent ) ) )* otherlv_7= ')' )? (otherlv_8= 'interface_types' otherlv_9= '(' ( (lv_interfaceTypes_10_0= ruleInterfaceType ) ) (otherlv_11= ';' ( (lv_interfaceTypes_12_0= ruleInterfaceType ) ) )* otherlv_13= ')' )? ) ;
    public final EObject ruleRepository() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_components_4_0 = null;

        EObject lv_components_6_0 = null;

        EObject lv_interfaceTypes_10_0 = null;

        EObject lv_interfaceTypes_12_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:475:28: ( (otherlv_0= 'repository' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'components' otherlv_3= '(' ( (lv_components_4_0= ruleComponent ) ) (otherlv_5= ';' ( (lv_components_6_0= ruleComponent ) ) )* otherlv_7= ')' )? (otherlv_8= 'interface_types' otherlv_9= '(' ( (lv_interfaceTypes_10_0= ruleInterfaceType ) ) (otherlv_11= ';' ( (lv_interfaceTypes_12_0= ruleInterfaceType ) ) )* otherlv_13= ')' )? ) )
            // InternalDedalADL.g:476:1: (otherlv_0= 'repository' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'components' otherlv_3= '(' ( (lv_components_4_0= ruleComponent ) ) (otherlv_5= ';' ( (lv_components_6_0= ruleComponent ) ) )* otherlv_7= ')' )? (otherlv_8= 'interface_types' otherlv_9= '(' ( (lv_interfaceTypes_10_0= ruleInterfaceType ) ) (otherlv_11= ';' ( (lv_interfaceTypes_12_0= ruleInterfaceType ) ) )* otherlv_13= ')' )? )
            {
            // InternalDedalADL.g:476:1: (otherlv_0= 'repository' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'components' otherlv_3= '(' ( (lv_components_4_0= ruleComponent ) ) (otherlv_5= ';' ( (lv_components_6_0= ruleComponent ) ) )* otherlv_7= ')' )? (otherlv_8= 'interface_types' otherlv_9= '(' ( (lv_interfaceTypes_10_0= ruleInterfaceType ) ) (otherlv_11= ';' ( (lv_interfaceTypes_12_0= ruleInterfaceType ) ) )* otherlv_13= ')' )? )
            // InternalDedalADL.g:476:3: otherlv_0= 'repository' ( (lv_name_1_0= ruleEString ) ) (otherlv_2= 'components' otherlv_3= '(' ( (lv_components_4_0= ruleComponent ) ) (otherlv_5= ';' ( (lv_components_6_0= ruleComponent ) ) )* otherlv_7= ')' )? (otherlv_8= 'interface_types' otherlv_9= '(' ( (lv_interfaceTypes_10_0= ruleInterfaceType ) ) (otherlv_11= ';' ( (lv_interfaceTypes_12_0= ruleInterfaceType ) ) )* otherlv_13= ')' )?
            {
            otherlv_0=(Token)match(input,18,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getRepositoryAccess().getRepositoryKeyword_0());
                
            // InternalDedalADL.g:480:1: ( (lv_name_1_0= ruleEString ) )
            // InternalDedalADL.g:481:1: (lv_name_1_0= ruleEString )
            {
            // InternalDedalADL.g:481:1: (lv_name_1_0= ruleEString )
            // InternalDedalADL.g:482:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRepositoryAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_10);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRepositoryRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:498:2: (otherlv_2= 'components' otherlv_3= '(' ( (lv_components_4_0= ruleComponent ) ) (otherlv_5= ';' ( (lv_components_6_0= ruleComponent ) ) )* otherlv_7= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDedalADL.g:498:4: otherlv_2= 'components' otherlv_3= '(' ( (lv_components_4_0= ruleComponent ) ) (otherlv_5= ';' ( (lv_components_6_0= ruleComponent ) ) )* otherlv_7= ')'
                    {
                    otherlv_2=(Token)match(input,19,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_2, grammarAccess.getRepositoryAccess().getComponentsKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_11); 

                        	newLeafNode(otherlv_3, grammarAccess.getRepositoryAccess().getLeftParenthesisKeyword_2_1());
                        
                    // InternalDedalADL.g:506:1: ( (lv_components_4_0= ruleComponent ) )
                    // InternalDedalADL.g:507:1: (lv_components_4_0= ruleComponent )
                    {
                    // InternalDedalADL.g:507:1: (lv_components_4_0= ruleComponent )
                    // InternalDedalADL.g:508:3: lv_components_4_0= ruleComponent
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsComponentParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_components_4_0=ruleComponent();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	        }
                           		add(
                           			current, 
                           			"components",
                            		lv_components_4_0, 
                            		"fr.ema.dedal.xtext.DedalADL.Component");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:524:2: (otherlv_5= ';' ( (lv_components_6_0= ruleComponent ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalDedalADL.g:524:4: otherlv_5= ';' ( (lv_components_6_0= ruleComponent ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_11); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getRepositoryAccess().getSemicolonKeyword_2_3_0());
                    	        
                    	    // InternalDedalADL.g:528:1: ( (lv_components_6_0= ruleComponent ) )
                    	    // InternalDedalADL.g:529:1: (lv_components_6_0= ruleComponent )
                    	    {
                    	    // InternalDedalADL.g:529:1: (lv_components_6_0= ruleComponent )
                    	    // InternalDedalADL.g:530:3: lv_components_6_0= ruleComponent
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRepositoryAccess().getComponentsComponentParserRuleCall_2_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_components_6_0=ruleComponent();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"components",
                    	            		lv_components_6_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.Component");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_12); 

                        	newLeafNode(otherlv_7, grammarAccess.getRepositoryAccess().getRightParenthesisKeyword_2_4());
                        

                    }
                    break;

            }

            // InternalDedalADL.g:550:3: (otherlv_8= 'interface_types' otherlv_9= '(' ( (lv_interfaceTypes_10_0= ruleInterfaceType ) ) (otherlv_11= ';' ( (lv_interfaceTypes_12_0= ruleInterfaceType ) ) )* otherlv_13= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDedalADL.g:550:5: otherlv_8= 'interface_types' otherlv_9= '(' ( (lv_interfaceTypes_10_0= ruleInterfaceType ) ) (otherlv_11= ';' ( (lv_interfaceTypes_12_0= ruleInterfaceType ) ) )* otherlv_13= ')'
                    {
                    otherlv_8=(Token)match(input,20,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_8, grammarAccess.getRepositoryAccess().getInterface_typesKeyword_3_0());
                        
                    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_13); 

                        	newLeafNode(otherlv_9, grammarAccess.getRepositoryAccess().getLeftParenthesisKeyword_3_1());
                        
                    // InternalDedalADL.g:558:1: ( (lv_interfaceTypes_10_0= ruleInterfaceType ) )
                    // InternalDedalADL.g:559:1: (lv_interfaceTypes_10_0= ruleInterfaceType )
                    {
                    // InternalDedalADL.g:559:1: (lv_interfaceTypes_10_0= ruleInterfaceType )
                    // InternalDedalADL.g:560:3: lv_interfaceTypes_10_0= ruleInterfaceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getRepositoryAccess().getInterfaceTypesInterfaceTypeParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_interfaceTypes_10_0=ruleInterfaceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	        }
                           		add(
                           			current, 
                           			"interfaceTypes",
                            		lv_interfaceTypes_10_0, 
                            		"fr.ema.dedal.xtext.DedalADL.InterfaceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:576:2: (otherlv_11= ';' ( (lv_interfaceTypes_12_0= ruleInterfaceType ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalDedalADL.g:576:4: otherlv_11= ';' ( (lv_interfaceTypes_12_0= ruleInterfaceType ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FollowSets000.FOLLOW_13); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getRepositoryAccess().getSemicolonKeyword_3_3_0());
                    	        
                    	    // InternalDedalADL.g:580:1: ( (lv_interfaceTypes_12_0= ruleInterfaceType ) )
                    	    // InternalDedalADL.g:581:1: (lv_interfaceTypes_12_0= ruleInterfaceType )
                    	    {
                    	    // InternalDedalADL.g:581:1: (lv_interfaceTypes_12_0= ruleInterfaceType )
                    	    // InternalDedalADL.g:582:3: lv_interfaceTypes_12_0= ruleInterfaceType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRepositoryAccess().getInterfaceTypesInterfaceTypeParserRuleCall_3_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_interfaceTypes_12_0=ruleInterfaceType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRepositoryRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"interfaceTypes",
                    	            		lv_interfaceTypes_12_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.InterfaceType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_13, grammarAccess.getRepositoryAccess().getRightParenthesisKeyword_3_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRepository"


    // $ANTLR start "entryRuleInterfaceType"
    // InternalDedalADL.g:610:1: entryRuleInterfaceType returns [EObject current=null] : iv_ruleInterfaceType= ruleInterfaceType EOF ;
    public final EObject entryRuleInterfaceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterfaceType = null;


        try {
            // InternalDedalADL.g:611:2: (iv_ruleInterfaceType= ruleInterfaceType EOF )
            // InternalDedalADL.g:612:2: iv_ruleInterfaceType= ruleInterfaceType EOF
            {
             newCompositeNode(grammarAccess.getInterfaceTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInterfaceType=ruleInterfaceType();

            state._fsp--;

             current =iv_ruleInterfaceType; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterfaceType"


    // $ANTLR start "ruleInterfaceType"
    // InternalDedalADL.g:619:1: ruleInterfaceType returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'signatures' otherlv_3= '(' ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ';' ( (lv_signatures_6_0= ruleSignature ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleInterfaceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_signatures_4_0 = null;

        EObject lv_signatures_6_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:622:28: ( (otherlv_0= 'type' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'signatures' otherlv_3= '(' ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ';' ( (lv_signatures_6_0= ruleSignature ) ) )* otherlv_7= ')' ) )
            // InternalDedalADL.g:623:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'signatures' otherlv_3= '(' ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ';' ( (lv_signatures_6_0= ruleSignature ) ) )* otherlv_7= ')' )
            {
            // InternalDedalADL.g:623:1: (otherlv_0= 'type' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'signatures' otherlv_3= '(' ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ';' ( (lv_signatures_6_0= ruleSignature ) ) )* otherlv_7= ')' )
            // InternalDedalADL.g:623:3: otherlv_0= 'type' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'signatures' otherlv_3= '(' ( (lv_signatures_4_0= ruleSignature ) ) (otherlv_5= ';' ( (lv_signatures_6_0= ruleSignature ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfaceTypeAccess().getTypeKeyword_0());
                
            // InternalDedalADL.g:627:1: ( (lv_name_1_0= ruleEString ) )
            // InternalDedalADL.g:628:1: (lv_name_1_0= ruleEString )
            {
            // InternalDedalADL.g:628:1: (lv_name_1_0= ruleEString )
            // InternalDedalADL.g:629:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInterfaceTypeAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_14);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInterfaceTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_2, grammarAccess.getInterfaceTypeAccess().getSignaturesKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_15); 

                	newLeafNode(otherlv_3, grammarAccess.getInterfaceTypeAccess().getLeftParenthesisKeyword_3());
                
            // InternalDedalADL.g:653:1: ( (lv_signatures_4_0= ruleSignature ) )
            // InternalDedalADL.g:654:1: (lv_signatures_4_0= ruleSignature )
            {
            // InternalDedalADL.g:654:1: (lv_signatures_4_0= ruleSignature )
            // InternalDedalADL.g:655:3: lv_signatures_4_0= ruleSignature
            {
             
            	        newCompositeNode(grammarAccess.getInterfaceTypeAccess().getSignaturesSignatureParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_7);
            lv_signatures_4_0=ruleSignature();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInterfaceTypeRule());
            	        }
                   		add(
                   			current, 
                   			"signatures",
                    		lv_signatures_4_0, 
                    		"fr.ema.dedal.xtext.DedalADL.Signature");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:671:2: (otherlv_5= ';' ( (lv_signatures_6_0= ruleSignature ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDedalADL.g:671:4: otherlv_5= ';' ( (lv_signatures_6_0= ruleSignature ) )
            	    {
            	    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15); 

            	        	newLeafNode(otherlv_5, grammarAccess.getInterfaceTypeAccess().getSemicolonKeyword_5_0());
            	        
            	    // InternalDedalADL.g:675:1: ( (lv_signatures_6_0= ruleSignature ) )
            	    // InternalDedalADL.g:676:1: (lv_signatures_6_0= ruleSignature )
            	    {
            	    // InternalDedalADL.g:676:1: (lv_signatures_6_0= ruleSignature )
            	    // InternalDedalADL.g:677:3: lv_signatures_6_0= ruleSignature
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getInterfaceTypeAccess().getSignaturesSignatureParserRuleCall_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    lv_signatures_6_0=ruleSignature();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getInterfaceTypeRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"signatures",
            	            		lv_signatures_6_0, 
            	            		"fr.ema.dedal.xtext.DedalADL.Signature");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getInterfaceTypeAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterfaceType"


    // $ANTLR start "entryRuleSignature"
    // InternalDedalADL.g:707:1: entryRuleSignature returns [EObject current=null] : iv_ruleSignature= ruleSignature EOF ;
    public final EObject entryRuleSignature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSignature = null;


        try {
            // InternalDedalADL.g:708:2: (iv_ruleSignature= ruleSignature EOF )
            // InternalDedalADL.g:709:2: iv_ruleSignature= ruleSignature EOF
            {
             newCompositeNode(grammarAccess.getSignatureRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSignature=ruleSignature();

            state._fsp--;

             current =iv_ruleSignature; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSignature"


    // $ANTLR start "ruleSignature"
    // InternalDedalADL.g:716:1: ruleSignature returns [EObject current=null] : (otherlv_0= 'signature' ( (lv_id_1_0= ruleEString ) ) (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ';' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? ) ;
    public final EObject ruleSignature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;

        EObject lv_parameters_8_0 = null;

        EObject lv_parameters_10_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:719:28: ( (otherlv_0= 'signature' ( (lv_id_1_0= ruleEString ) ) (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ';' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? ) )
            // InternalDedalADL.g:720:1: (otherlv_0= 'signature' ( (lv_id_1_0= ruleEString ) ) (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ';' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? )
            {
            // InternalDedalADL.g:720:1: (otherlv_0= 'signature' ( (lv_id_1_0= ruleEString ) ) (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ';' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )? )
            // InternalDedalADL.g:720:3: otherlv_0= 'signature' ( (lv_id_1_0= ruleEString ) ) (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? (otherlv_6= 'parameters' otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ';' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )?
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getSignatureAccess().getSignatureKeyword_0());
                
            // InternalDedalADL.g:724:1: ( (lv_id_1_0= ruleEString ) )
            // InternalDedalADL.g:725:1: (lv_id_1_0= ruleEString )
            {
            // InternalDedalADL.g:725:1: (lv_id_1_0= ruleEString )
            // InternalDedalADL.g:726:3: lv_id_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSignatureAccess().getIdEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_16);
            lv_id_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSignatureRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:742:2: (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDedalADL.g:742:4: otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getSignatureAccess().getNameKeyword_2_0());
                        
                    // InternalDedalADL.g:746:1: ( (lv_name_3_0= ruleEString ) )
                    // InternalDedalADL.g:747:1: (lv_name_3_0= ruleEString )
                    {
                    // InternalDedalADL.g:747:1: (lv_name_3_0= ruleEString )
                    // InternalDedalADL.g:748:3: lv_name_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSignatureAccess().getNameEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_17);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"fr.ema.dedal.xtext.DedalADL.EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDedalADL.g:764:4: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDedalADL.g:764:6: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_4, grammarAccess.getSignatureAccess().getTypeKeyword_3_0());
                        
                    // InternalDedalADL.g:768:1: ( (lv_type_5_0= ruleEString ) )
                    // InternalDedalADL.g:769:1: (lv_type_5_0= ruleEString )
                    {
                    // InternalDedalADL.g:769:1: (lv_type_5_0= ruleEString )
                    // InternalDedalADL.g:770:3: lv_type_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSignatureAccess().getTypeEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_18);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_5_0, 
                            		"fr.ema.dedal.xtext.DedalADL.EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDedalADL.g:786:4: (otherlv_6= 'parameters' otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ';' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==25) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalDedalADL.g:786:6: otherlv_6= 'parameters' otherlv_7= '(' ( (lv_parameters_8_0= ruleParameter ) ) (otherlv_9= ';' ( (lv_parameters_10_0= ruleParameter ) ) )* otherlv_11= ')'
                    {
                    otherlv_6=(Token)match(input,25,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_6, grammarAccess.getSignatureAccess().getParametersKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,14,FollowSets000.FOLLOW_19); 

                        	newLeafNode(otherlv_7, grammarAccess.getSignatureAccess().getLeftParenthesisKeyword_4_1());
                        
                    // InternalDedalADL.g:794:1: ( (lv_parameters_8_0= ruleParameter ) )
                    // InternalDedalADL.g:795:1: (lv_parameters_8_0= ruleParameter )
                    {
                    // InternalDedalADL.g:795:1: (lv_parameters_8_0= ruleParameter )
                    // InternalDedalADL.g:796:3: lv_parameters_8_0= ruleParameter
                    {
                     
                    	        newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_parameters_8_0=ruleParameter();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	        }
                           		add(
                           			current, 
                           			"parameters",
                            		lv_parameters_8_0, 
                            		"fr.ema.dedal.xtext.DedalADL.Parameter");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:812:2: (otherlv_9= ';' ( (lv_parameters_10_0= ruleParameter ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==15) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalDedalADL.g:812:4: otherlv_9= ';' ( (lv_parameters_10_0= ruleParameter ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_19); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getSignatureAccess().getSemicolonKeyword_4_3_0());
                    	        
                    	    // InternalDedalADL.g:816:1: ( (lv_parameters_10_0= ruleParameter ) )
                    	    // InternalDedalADL.g:817:1: (lv_parameters_10_0= ruleParameter )
                    	    {
                    	    // InternalDedalADL.g:817:1: (lv_parameters_10_0= ruleParameter )
                    	    // InternalDedalADL.g:818:3: lv_parameters_10_0= ruleParameter
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSignatureAccess().getParametersParameterParserRuleCall_4_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_parameters_10_0=ruleParameter();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSignatureRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"parameters",
                    	            		lv_parameters_10_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.Parameter");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_11, grammarAccess.getSignatureAccess().getRightParenthesisKeyword_4_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSignature"


    // $ANTLR start "entryRuleParameter"
    // InternalDedalADL.g:846:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalDedalADL.g:847:2: (iv_ruleParameter= ruleParameter EOF )
            // InternalDedalADL.g:848:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalDedalADL.g:855:1: ruleParameter returns [EObject current=null] : (otherlv_0= 'parameter' ( (lv_id_1_0= ruleEString ) ) (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_id_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        AntlrDatatypeRuleToken lv_type_5_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:858:28: ( (otherlv_0= 'parameter' ( (lv_id_1_0= ruleEString ) ) (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? ) )
            // InternalDedalADL.g:859:1: (otherlv_0= 'parameter' ( (lv_id_1_0= ruleEString ) ) (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? )
            {
            // InternalDedalADL.g:859:1: (otherlv_0= 'parameter' ( (lv_id_1_0= ruleEString ) ) (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )? )
            // InternalDedalADL.g:859:3: otherlv_0= 'parameter' ( (lv_id_1_0= ruleEString ) ) (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )? (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,26,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getParameterAccess().getParameterKeyword_0());
                
            // InternalDedalADL.g:863:1: ( (lv_id_1_0= ruleEString ) )
            // InternalDedalADL.g:864:1: (lv_id_1_0= ruleEString )
            {
            // InternalDedalADL.g:864:1: (lv_id_1_0= ruleEString )
            // InternalDedalADL.g:865:3: lv_id_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getParameterAccess().getIdEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_20);
            lv_id_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getParameterRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:881:2: (otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==24) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalDedalADL.g:881:4: otherlv_2= 'name' ( (lv_name_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,24,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getParameterAccess().getNameKeyword_2_0());
                        
                    // InternalDedalADL.g:885:1: ( (lv_name_3_0= ruleEString ) )
                    // InternalDedalADL.g:886:1: (lv_name_3_0= ruleEString )
                    {
                    // InternalDedalADL.g:886:1: (lv_name_3_0= ruleEString )
                    // InternalDedalADL.g:887:3: lv_name_3_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_21);
                    lv_name_3_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"fr.ema.dedal.xtext.DedalADL.EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDedalADL.g:903:4: (otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalDedalADL.g:903:6: otherlv_4= 'type' ( (lv_type_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,21,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getTypeKeyword_3_0());
                        
                    // InternalDedalADL.g:907:1: ( (lv_type_5_0= ruleEString ) )
                    // InternalDedalADL.g:908:1: (lv_type_5_0= ruleEString )
                    {
                    // InternalDedalADL.g:908:1: (lv_type_5_0= ruleEString )
                    // InternalDedalADL.g:909:3: lv_type_5_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getParameterAccess().getTypeEStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_type_5_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getParameterRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_5_0, 
                            		"fr.ema.dedal.xtext.DedalADL.EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleSpecification"
    // InternalDedalADL.g:933:1: entryRuleSpecification returns [EObject current=null] : iv_ruleSpecification= ruleSpecification EOF ;
    public final EObject entryRuleSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecification = null;


        try {
            // InternalDedalADL.g:934:2: (iv_ruleSpecification= ruleSpecification EOF )
            // InternalDedalADL.g:935:2: iv_ruleSpecification= ruleSpecification EOF
            {
             newCompositeNode(grammarAccess.getSpecificationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSpecification=ruleSpecification();

            state._fsp--;

             current =iv_ruleSpecification; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSpecification"


    // $ANTLR start "ruleSpecification"
    // InternalDedalADL.g:942:1: ruleSpecification returns [EObject current=null] : (otherlv_0= 'specification' ( (lv_name_1_0= rulespecification_name ) ) (otherlv_2= 'component_roles' ( (lv_specComponents_3_0= ruleCompRole ) ) (otherlv_4= ';' ( (lv_specComponents_5_0= ruleCompRole ) ) )* )? (otherlv_6= 'connections' ( (lv_specConnections_7_0= ruleRoleConnection ) ) ( (lv_specConnections_8_0= ruleRoleConnection ) )* )? (otherlv_9= 'versionID' this_REVISION_NUMB_10= RULE_REVISION_NUMB )? (otherlv_11= 'pre_version' rulepre_version )? (otherlv_13= 'by' rulechange )? (otherlv_15= 'interface_types' ( (lv_interfaceTypes_16_0= ruleInterfaceType ) ) (otherlv_17= ';' ( (lv_interfaceTypes_18_0= ruleInterfaceType ) ) )* )? ) ;
    public final EObject ruleSpecification() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token this_REVISION_NUMB_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_specComponents_3_0 = null;

        EObject lv_specComponents_5_0 = null;

        EObject lv_specConnections_7_0 = null;

        EObject lv_specConnections_8_0 = null;

        EObject lv_interfaceTypes_16_0 = null;

        EObject lv_interfaceTypes_18_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:945:28: ( (otherlv_0= 'specification' ( (lv_name_1_0= rulespecification_name ) ) (otherlv_2= 'component_roles' ( (lv_specComponents_3_0= ruleCompRole ) ) (otherlv_4= ';' ( (lv_specComponents_5_0= ruleCompRole ) ) )* )? (otherlv_6= 'connections' ( (lv_specConnections_7_0= ruleRoleConnection ) ) ( (lv_specConnections_8_0= ruleRoleConnection ) )* )? (otherlv_9= 'versionID' this_REVISION_NUMB_10= RULE_REVISION_NUMB )? (otherlv_11= 'pre_version' rulepre_version )? (otherlv_13= 'by' rulechange )? (otherlv_15= 'interface_types' ( (lv_interfaceTypes_16_0= ruleInterfaceType ) ) (otherlv_17= ';' ( (lv_interfaceTypes_18_0= ruleInterfaceType ) ) )* )? ) )
            // InternalDedalADL.g:946:1: (otherlv_0= 'specification' ( (lv_name_1_0= rulespecification_name ) ) (otherlv_2= 'component_roles' ( (lv_specComponents_3_0= ruleCompRole ) ) (otherlv_4= ';' ( (lv_specComponents_5_0= ruleCompRole ) ) )* )? (otherlv_6= 'connections' ( (lv_specConnections_7_0= ruleRoleConnection ) ) ( (lv_specConnections_8_0= ruleRoleConnection ) )* )? (otherlv_9= 'versionID' this_REVISION_NUMB_10= RULE_REVISION_NUMB )? (otherlv_11= 'pre_version' rulepre_version )? (otherlv_13= 'by' rulechange )? (otherlv_15= 'interface_types' ( (lv_interfaceTypes_16_0= ruleInterfaceType ) ) (otherlv_17= ';' ( (lv_interfaceTypes_18_0= ruleInterfaceType ) ) )* )? )
            {
            // InternalDedalADL.g:946:1: (otherlv_0= 'specification' ( (lv_name_1_0= rulespecification_name ) ) (otherlv_2= 'component_roles' ( (lv_specComponents_3_0= ruleCompRole ) ) (otherlv_4= ';' ( (lv_specComponents_5_0= ruleCompRole ) ) )* )? (otherlv_6= 'connections' ( (lv_specConnections_7_0= ruleRoleConnection ) ) ( (lv_specConnections_8_0= ruleRoleConnection ) )* )? (otherlv_9= 'versionID' this_REVISION_NUMB_10= RULE_REVISION_NUMB )? (otherlv_11= 'pre_version' rulepre_version )? (otherlv_13= 'by' rulechange )? (otherlv_15= 'interface_types' ( (lv_interfaceTypes_16_0= ruleInterfaceType ) ) (otherlv_17= ';' ( (lv_interfaceTypes_18_0= ruleInterfaceType ) ) )* )? )
            // InternalDedalADL.g:946:3: otherlv_0= 'specification' ( (lv_name_1_0= rulespecification_name ) ) (otherlv_2= 'component_roles' ( (lv_specComponents_3_0= ruleCompRole ) ) (otherlv_4= ';' ( (lv_specComponents_5_0= ruleCompRole ) ) )* )? (otherlv_6= 'connections' ( (lv_specConnections_7_0= ruleRoleConnection ) ) ( (lv_specConnections_8_0= ruleRoleConnection ) )* )? (otherlv_9= 'versionID' this_REVISION_NUMB_10= RULE_REVISION_NUMB )? (otherlv_11= 'pre_version' rulepre_version )? (otherlv_13= 'by' rulechange )? (otherlv_15= 'interface_types' ( (lv_interfaceTypes_16_0= ruleInterfaceType ) ) (otherlv_17= ';' ( (lv_interfaceTypes_18_0= ruleInterfaceType ) ) )* )?
            {
            otherlv_0=(Token)match(input,27,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_0, grammarAccess.getSpecificationAccess().getSpecificationKeyword_0());
                
            // InternalDedalADL.g:950:1: ( (lv_name_1_0= rulespecification_name ) )
            // InternalDedalADL.g:951:1: (lv_name_1_0= rulespecification_name )
            {
            // InternalDedalADL.g:951:1: (lv_name_1_0= rulespecification_name )
            // InternalDedalADL.g:952:3: lv_name_1_0= rulespecification_name
            {
             
            	        newCompositeNode(grammarAccess.getSpecificationAccess().getNameSpecification_nameParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_23);
            lv_name_1_0=rulespecification_name();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.specification_name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:968:2: (otherlv_2= 'component_roles' ( (lv_specComponents_3_0= ruleCompRole ) ) (otherlv_4= ';' ( (lv_specComponents_5_0= ruleCompRole ) ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalDedalADL.g:968:4: otherlv_2= 'component_roles' ( (lv_specComponents_3_0= ruleCompRole ) ) (otherlv_4= ';' ( (lv_specComponents_5_0= ruleCompRole ) ) )*
                    {
                    otherlv_2=(Token)match(input,28,FollowSets000.FOLLOW_24); 

                        	newLeafNode(otherlv_2, grammarAccess.getSpecificationAccess().getComponent_rolesKeyword_2_0());
                        
                    // InternalDedalADL.g:972:1: ( (lv_specComponents_3_0= ruleCompRole ) )
                    // InternalDedalADL.g:973:1: (lv_specComponents_3_0= ruleCompRole )
                    {
                    // InternalDedalADL.g:973:1: (lv_specComponents_3_0= ruleCompRole )
                    // InternalDedalADL.g:974:3: lv_specComponents_3_0= ruleCompRole
                    {
                     
                    	        newCompositeNode(grammarAccess.getSpecificationAccess().getSpecComponentsCompRoleParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_25);
                    lv_specComponents_3_0=ruleCompRole();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	        }
                           		add(
                           			current, 
                           			"specComponents",
                            		lv_specComponents_3_0, 
                            		"fr.ema.dedal.xtext.DedalADL.CompRole");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:990:2: (otherlv_4= ';' ( (lv_specComponents_5_0= ruleCompRole ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==15) ) {
                            int LA21_2 = input.LA(2);

                            if ( (LA21_2==33) ) {
                                alt21=1;
                            }


                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalDedalADL.g:990:4: otherlv_4= ';' ( (lv_specComponents_5_0= ruleCompRole ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_24); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getSpecificationAccess().getSemicolonKeyword_2_2_0());
                    	        
                    	    // InternalDedalADL.g:994:1: ( (lv_specComponents_5_0= ruleCompRole ) )
                    	    // InternalDedalADL.g:995:1: (lv_specComponents_5_0= ruleCompRole )
                    	    {
                    	    // InternalDedalADL.g:995:1: (lv_specComponents_5_0= ruleCompRole )
                    	    // InternalDedalADL.g:996:3: lv_specComponents_5_0= ruleCompRole
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSpecificationAccess().getSpecComponentsCompRoleParserRuleCall_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_25);
                    	    lv_specComponents_5_0=ruleCompRole();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"specComponents",
                    	            		lv_specComponents_5_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.CompRole");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDedalADL.g:1012:6: (otherlv_6= 'connections' ( (lv_specConnections_7_0= ruleRoleConnection ) ) ( (lv_specConnections_8_0= ruleRoleConnection ) )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalDedalADL.g:1012:8: otherlv_6= 'connections' ( (lv_specConnections_7_0= ruleRoleConnection ) ) ( (lv_specConnections_8_0= ruleRoleConnection ) )*
                    {
                    otherlv_6=(Token)match(input,29,FollowSets000.FOLLOW_26); 

                        	newLeafNode(otherlv_6, grammarAccess.getSpecificationAccess().getConnectionsKeyword_3_0());
                        
                    // InternalDedalADL.g:1016:1: ( (lv_specConnections_7_0= ruleRoleConnection ) )
                    // InternalDedalADL.g:1017:1: (lv_specConnections_7_0= ruleRoleConnection )
                    {
                    // InternalDedalADL.g:1017:1: (lv_specConnections_7_0= ruleRoleConnection )
                    // InternalDedalADL.g:1018:3: lv_specConnections_7_0= ruleRoleConnection
                    {
                     
                    	        newCompositeNode(grammarAccess.getSpecificationAccess().getSpecConnectionsRoleConnectionParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_27);
                    lv_specConnections_7_0=ruleRoleConnection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	        }
                           		add(
                           			current, 
                           			"specConnections",
                            		lv_specConnections_7_0, 
                            		"fr.ema.dedal.xtext.DedalADL.RoleConnection");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:1034:2: ( (lv_specConnections_8_0= ruleRoleConnection ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==45) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalDedalADL.g:1035:1: (lv_specConnections_8_0= ruleRoleConnection )
                    	    {
                    	    // InternalDedalADL.g:1035:1: (lv_specConnections_8_0= ruleRoleConnection )
                    	    // InternalDedalADL.g:1036:3: lv_specConnections_8_0= ruleRoleConnection
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSpecificationAccess().getSpecConnectionsRoleConnectionParserRuleCall_3_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_27);
                    	    lv_specConnections_8_0=ruleRoleConnection();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"specConnections",
                    	            		lv_specConnections_8_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.RoleConnection");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDedalADL.g:1052:5: (otherlv_9= 'versionID' this_REVISION_NUMB_10= RULE_REVISION_NUMB )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalDedalADL.g:1052:7: otherlv_9= 'versionID' this_REVISION_NUMB_10= RULE_REVISION_NUMB
                    {
                    otherlv_9=(Token)match(input,30,FollowSets000.FOLLOW_28); 

                        	newLeafNode(otherlv_9, grammarAccess.getSpecificationAccess().getVersionIDKeyword_4_0());
                        
                    this_REVISION_NUMB_10=(Token)match(input,RULE_REVISION_NUMB,FollowSets000.FOLLOW_29); 
                     
                        newLeafNode(this_REVISION_NUMB_10, grammarAccess.getSpecificationAccess().getREVISION_NUMBTerminalRuleCall_4_1()); 
                        

                    }
                    break;

            }

            // InternalDedalADL.g:1060:3: (otherlv_11= 'pre_version' rulepre_version )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalDedalADL.g:1060:5: otherlv_11= 'pre_version' rulepre_version
                    {
                    otherlv_11=(Token)match(input,31,FollowSets000.FOLLOW_30); 

                        	newLeafNode(otherlv_11, grammarAccess.getSpecificationAccess().getPre_versionKeyword_5_0());
                        
                     
                            newCompositeNode(grammarAccess.getSpecificationAccess().getPre_versionParserRuleCall_5_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_31);
                    rulepre_version();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // InternalDedalADL.g:1072:3: (otherlv_13= 'by' rulechange )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==32) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalDedalADL.g:1072:5: otherlv_13= 'by' rulechange
                    {
                    otherlv_13=(Token)match(input,32,FollowSets000.FOLLOW_32); 

                        	newLeafNode(otherlv_13, grammarAccess.getSpecificationAccess().getByKeyword_6_0());
                        
                     
                            newCompositeNode(grammarAccess.getSpecificationAccess().getChangeParserRuleCall_6_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_12);
                    rulechange();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // InternalDedalADL.g:1084:3: (otherlv_15= 'interface_types' ( (lv_interfaceTypes_16_0= ruleInterfaceType ) ) (otherlv_17= ';' ( (lv_interfaceTypes_18_0= ruleInterfaceType ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalDedalADL.g:1084:5: otherlv_15= 'interface_types' ( (lv_interfaceTypes_16_0= ruleInterfaceType ) ) (otherlv_17= ';' ( (lv_interfaceTypes_18_0= ruleInterfaceType ) ) )*
                    {
                    otherlv_15=(Token)match(input,20,FollowSets000.FOLLOW_13); 

                        	newLeafNode(otherlv_15, grammarAccess.getSpecificationAccess().getInterface_typesKeyword_7_0());
                        
                    // InternalDedalADL.g:1088:1: ( (lv_interfaceTypes_16_0= ruleInterfaceType ) )
                    // InternalDedalADL.g:1089:1: (lv_interfaceTypes_16_0= ruleInterfaceType )
                    {
                    // InternalDedalADL.g:1089:1: (lv_interfaceTypes_16_0= ruleInterfaceType )
                    // InternalDedalADL.g:1090:3: lv_interfaceTypes_16_0= ruleInterfaceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getSpecificationAccess().getInterfaceTypesInterfaceTypeParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_33);
                    lv_interfaceTypes_16_0=ruleInterfaceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	        }
                           		add(
                           			current, 
                           			"interfaceTypes",
                            		lv_interfaceTypes_16_0, 
                            		"fr.ema.dedal.xtext.DedalADL.InterfaceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:1106:2: (otherlv_17= ';' ( (lv_interfaceTypes_18_0= ruleInterfaceType ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==15) ) {
                            int LA28_1 = input.LA(2);

                            if ( (LA28_1==21) ) {
                                alt28=1;
                            }


                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalDedalADL.g:1106:4: otherlv_17= ';' ( (lv_interfaceTypes_18_0= ruleInterfaceType ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FollowSets000.FOLLOW_13); 

                    	        	newLeafNode(otherlv_17, grammarAccess.getSpecificationAccess().getSemicolonKeyword_7_2_0());
                    	        
                    	    // InternalDedalADL.g:1110:1: ( (lv_interfaceTypes_18_0= ruleInterfaceType ) )
                    	    // InternalDedalADL.g:1111:1: (lv_interfaceTypes_18_0= ruleInterfaceType )
                    	    {
                    	    // InternalDedalADL.g:1111:1: (lv_interfaceTypes_18_0= ruleInterfaceType )
                    	    // InternalDedalADL.g:1112:3: lv_interfaceTypes_18_0= ruleInterfaceType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSpecificationAccess().getInterfaceTypesInterfaceTypeParserRuleCall_7_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_33);
                    	    lv_interfaceTypes_18_0=ruleInterfaceType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSpecificationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"interfaceTypes",
                    	            		lv_interfaceTypes_18_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.InterfaceType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecification"


    // $ANTLR start "entryRulespecification_name"
    // InternalDedalADL.g:1136:1: entryRulespecification_name returns [String current=null] : iv_rulespecification_name= rulespecification_name EOF ;
    public final String entryRulespecification_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulespecification_name = null;


        try {
            // InternalDedalADL.g:1137:2: (iv_rulespecification_name= rulespecification_name EOF )
            // InternalDedalADL.g:1138:2: iv_rulespecification_name= rulespecification_name EOF
            {
             newCompositeNode(grammarAccess.getSpecification_nameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulespecification_name=rulespecification_name();

            state._fsp--;

             current =iv_rulespecification_name.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulespecification_name"


    // $ANTLR start "rulespecification_name"
    // InternalDedalADL.g:1145:1: rulespecification_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken rulespecification_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:1148:28: (this_ID_0= RULE_ID )
            // InternalDedalADL.g:1149:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getSpecification_nameAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulespecification_name"


    // $ANTLR start "entryRuleCompRole"
    // InternalDedalADL.g:1164:1: entryRuleCompRole returns [EObject current=null] : iv_ruleCompRole= ruleCompRole EOF ;
    public final EObject entryRuleCompRole() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompRole = null;


        try {
            // InternalDedalADL.g:1165:2: (iv_ruleCompRole= ruleCompRole EOF )
            // InternalDedalADL.g:1166:2: iv_ruleCompRole= ruleCompRole EOF
            {
             newCompositeNode(grammarAccess.getCompRoleRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompRole=ruleCompRole();

            state._fsp--;

             current =iv_ruleCompRole; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompRole"


    // $ANTLR start "ruleCompRole"
    // InternalDedalADL.g:1173:1: ruleCompRole returns [EObject current=null] : (otherlv_0= 'component_role' ( (lv_name_1_0= rulecomponent_role_name ) ) otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) (otherlv_4= 'required_interfaces' ( (lv_compInterfaces_5_0= ruleInterface ) ) (otherlv_6= ';' ( (lv_compInterfaces_7_0= ruleInterface ) ) )* )? (otherlv_8= 'provided_interfaces' ( (lv_compInterfaces_9_0= ruleInterface ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInterface ) ) )* )? (otherlv_12= 'MinInstanceNbr' ( (lv_minInstanceNbr_13_0= RULE_INT ) ) )? (otherlv_14= 'MaxInstanceNbr' ( (lv_maxInstanceNbr_15_0= RULE_INT ) ) )? (otherlv_16= 'interactions' ( (lv_compInterfaces_17_0= ruleInteraction ) ) (otherlv_18= ';' ( (lv_compInterfaces_19_0= ruleInteraction ) ) )* )? ) ;
    public final EObject ruleCompRole() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token lv_minInstanceNbr_13_0=null;
        Token otherlv_14=null;
        Token lv_maxInstanceNbr_15_0=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_compInterfaces_5_0 = null;

        EObject lv_compInterfaces_7_0 = null;

        EObject lv_compInterfaces_9_0 = null;

        EObject lv_compInterfaces_11_0 = null;

        EObject lv_compInterfaces_17_0 = null;

        EObject lv_compInterfaces_19_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:1176:28: ( (otherlv_0= 'component_role' ( (lv_name_1_0= rulecomponent_role_name ) ) otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) (otherlv_4= 'required_interfaces' ( (lv_compInterfaces_5_0= ruleInterface ) ) (otherlv_6= ';' ( (lv_compInterfaces_7_0= ruleInterface ) ) )* )? (otherlv_8= 'provided_interfaces' ( (lv_compInterfaces_9_0= ruleInterface ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInterface ) ) )* )? (otherlv_12= 'MinInstanceNbr' ( (lv_minInstanceNbr_13_0= RULE_INT ) ) )? (otherlv_14= 'MaxInstanceNbr' ( (lv_maxInstanceNbr_15_0= RULE_INT ) ) )? (otherlv_16= 'interactions' ( (lv_compInterfaces_17_0= ruleInteraction ) ) (otherlv_18= ';' ( (lv_compInterfaces_19_0= ruleInteraction ) ) )* )? ) )
            // InternalDedalADL.g:1177:1: (otherlv_0= 'component_role' ( (lv_name_1_0= rulecomponent_role_name ) ) otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) (otherlv_4= 'required_interfaces' ( (lv_compInterfaces_5_0= ruleInterface ) ) (otherlv_6= ';' ( (lv_compInterfaces_7_0= ruleInterface ) ) )* )? (otherlv_8= 'provided_interfaces' ( (lv_compInterfaces_9_0= ruleInterface ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInterface ) ) )* )? (otherlv_12= 'MinInstanceNbr' ( (lv_minInstanceNbr_13_0= RULE_INT ) ) )? (otherlv_14= 'MaxInstanceNbr' ( (lv_maxInstanceNbr_15_0= RULE_INT ) ) )? (otherlv_16= 'interactions' ( (lv_compInterfaces_17_0= ruleInteraction ) ) (otherlv_18= ';' ( (lv_compInterfaces_19_0= ruleInteraction ) ) )* )? )
            {
            // InternalDedalADL.g:1177:1: (otherlv_0= 'component_role' ( (lv_name_1_0= rulecomponent_role_name ) ) otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) (otherlv_4= 'required_interfaces' ( (lv_compInterfaces_5_0= ruleInterface ) ) (otherlv_6= ';' ( (lv_compInterfaces_7_0= ruleInterface ) ) )* )? (otherlv_8= 'provided_interfaces' ( (lv_compInterfaces_9_0= ruleInterface ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInterface ) ) )* )? (otherlv_12= 'MinInstanceNbr' ( (lv_minInstanceNbr_13_0= RULE_INT ) ) )? (otherlv_14= 'MaxInstanceNbr' ( (lv_maxInstanceNbr_15_0= RULE_INT ) ) )? (otherlv_16= 'interactions' ( (lv_compInterfaces_17_0= ruleInteraction ) ) (otherlv_18= ';' ( (lv_compInterfaces_19_0= ruleInteraction ) ) )* )? )
            // InternalDedalADL.g:1177:3: otherlv_0= 'component_role' ( (lv_name_1_0= rulecomponent_role_name ) ) otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) (otherlv_4= 'required_interfaces' ( (lv_compInterfaces_5_0= ruleInterface ) ) (otherlv_6= ';' ( (lv_compInterfaces_7_0= ruleInterface ) ) )* )? (otherlv_8= 'provided_interfaces' ( (lv_compInterfaces_9_0= ruleInterface ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInterface ) ) )* )? (otherlv_12= 'MinInstanceNbr' ( (lv_minInstanceNbr_13_0= RULE_INT ) ) )? (otherlv_14= 'MaxInstanceNbr' ( (lv_maxInstanceNbr_15_0= RULE_INT ) ) )? (otherlv_16= 'interactions' ( (lv_compInterfaces_17_0= ruleInteraction ) ) (otherlv_18= ';' ( (lv_compInterfaces_19_0= ruleInteraction ) ) )* )?
            {
            otherlv_0=(Token)match(input,33,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_0, grammarAccess.getCompRoleAccess().getComponent_roleKeyword_0());
                
            // InternalDedalADL.g:1181:1: ( (lv_name_1_0= rulecomponent_role_name ) )
            // InternalDedalADL.g:1182:1: (lv_name_1_0= rulecomponent_role_name )
            {
            // InternalDedalADL.g:1182:1: (lv_name_1_0= rulecomponent_role_name )
            // InternalDedalADL.g:1183:3: lv_name_1_0= rulecomponent_role_name
            {
             
            	        newCompositeNode(grammarAccess.getCompRoleAccess().getNameComponent_role_nameParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_34);
            lv_name_1_0=rulecomponent_role_name();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompRoleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.component_role_name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getCompRoleAccess().getIdKeyword_2());
                
            // InternalDedalADL.g:1203:1: ( (lv_id_3_0= ruleEString ) )
            // InternalDedalADL.g:1204:1: (lv_id_3_0= ruleEString )
            {
            // InternalDedalADL.g:1204:1: (lv_id_3_0= ruleEString )
            // InternalDedalADL.g:1205:3: lv_id_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCompRoleAccess().getIdEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_35);
            lv_id_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompRoleRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_3_0, 
                    		"fr.ema.dedal.xtext.DedalADL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:1221:2: (otherlv_4= 'required_interfaces' ( (lv_compInterfaces_5_0= ruleInterface ) ) (otherlv_6= ';' ( (lv_compInterfaces_7_0= ruleInterface ) ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalDedalADL.g:1221:4: otherlv_4= 'required_interfaces' ( (lv_compInterfaces_5_0= ruleInterface ) ) (otherlv_6= ';' ( (lv_compInterfaces_7_0= ruleInterface ) ) )*
                    {
                    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_36); 

                        	newLeafNode(otherlv_4, grammarAccess.getCompRoleAccess().getRequired_interfacesKeyword_4_0());
                        
                    // InternalDedalADL.g:1225:1: ( (lv_compInterfaces_5_0= ruleInterface ) )
                    // InternalDedalADL.g:1226:1: (lv_compInterfaces_5_0= ruleInterface )
                    {
                    // InternalDedalADL.g:1226:1: (lv_compInterfaces_5_0= ruleInterface )
                    // InternalDedalADL.g:1227:3: lv_compInterfaces_5_0= ruleInterface
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompRoleAccess().getCompInterfacesInterfaceParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_37);
                    lv_compInterfaces_5_0=ruleInterface();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompRoleRule());
                    	        }
                           		add(
                           			current, 
                           			"compInterfaces",
                            		lv_compInterfaces_5_0, 
                            		"fr.ema.dedal.xtext.DedalADL.Interface");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:1243:2: (otherlv_6= ';' ( (lv_compInterfaces_7_0= ruleInterface ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==15) ) {
                            int LA30_2 = input.LA(2);

                            if ( (LA30_2==40) ) {
                                alt30=1;
                            }


                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalDedalADL.g:1243:4: otherlv_6= ';' ( (lv_compInterfaces_7_0= ruleInterface ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_36); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getCompRoleAccess().getSemicolonKeyword_4_2_0());
                    	        
                    	    // InternalDedalADL.g:1247:1: ( (lv_compInterfaces_7_0= ruleInterface ) )
                    	    // InternalDedalADL.g:1248:1: (lv_compInterfaces_7_0= ruleInterface )
                    	    {
                    	    // InternalDedalADL.g:1248:1: (lv_compInterfaces_7_0= ruleInterface )
                    	    // InternalDedalADL.g:1249:3: lv_compInterfaces_7_0= ruleInterface
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCompRoleAccess().getCompInterfacesInterfaceParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_37);
                    	    lv_compInterfaces_7_0=ruleInterface();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCompRoleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"compInterfaces",
                    	            		lv_compInterfaces_7_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.Interface");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDedalADL.g:1265:6: (otherlv_8= 'provided_interfaces' ( (lv_compInterfaces_9_0= ruleInterface ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInterface ) ) )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==36) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalDedalADL.g:1265:8: otherlv_8= 'provided_interfaces' ( (lv_compInterfaces_9_0= ruleInterface ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInterface ) ) )*
                    {
                    otherlv_8=(Token)match(input,36,FollowSets000.FOLLOW_36); 

                        	newLeafNode(otherlv_8, grammarAccess.getCompRoleAccess().getProvided_interfacesKeyword_5_0());
                        
                    // InternalDedalADL.g:1269:1: ( (lv_compInterfaces_9_0= ruleInterface ) )
                    // InternalDedalADL.g:1270:1: (lv_compInterfaces_9_0= ruleInterface )
                    {
                    // InternalDedalADL.g:1270:1: (lv_compInterfaces_9_0= ruleInterface )
                    // InternalDedalADL.g:1271:3: lv_compInterfaces_9_0= ruleInterface
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompRoleAccess().getCompInterfacesInterfaceParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_38);
                    lv_compInterfaces_9_0=ruleInterface();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompRoleRule());
                    	        }
                           		add(
                           			current, 
                           			"compInterfaces",
                            		lv_compInterfaces_9_0, 
                            		"fr.ema.dedal.xtext.DedalADL.Interface");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:1287:2: (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInterface ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==15) ) {
                            int LA32_2 = input.LA(2);

                            if ( (LA32_2==40) ) {
                                alt32=1;
                            }


                        }


                        switch (alt32) {
                    	case 1 :
                    	    // InternalDedalADL.g:1287:4: otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInterface ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_36); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getCompRoleAccess().getSemicolonKeyword_5_2_0());
                    	        
                    	    // InternalDedalADL.g:1291:1: ( (lv_compInterfaces_11_0= ruleInterface ) )
                    	    // InternalDedalADL.g:1292:1: (lv_compInterfaces_11_0= ruleInterface )
                    	    {
                    	    // InternalDedalADL.g:1292:1: (lv_compInterfaces_11_0= ruleInterface )
                    	    // InternalDedalADL.g:1293:3: lv_compInterfaces_11_0= ruleInterface
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCompRoleAccess().getCompInterfacesInterfaceParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_38);
                    	    lv_compInterfaces_11_0=ruleInterface();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCompRoleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"compInterfaces",
                    	            		lv_compInterfaces_11_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.Interface");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDedalADL.g:1309:6: (otherlv_12= 'MinInstanceNbr' ( (lv_minInstanceNbr_13_0= RULE_INT ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==37) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalDedalADL.g:1309:8: otherlv_12= 'MinInstanceNbr' ( (lv_minInstanceNbr_13_0= RULE_INT ) )
                    {
                    otherlv_12=(Token)match(input,37,FollowSets000.FOLLOW_39); 

                        	newLeafNode(otherlv_12, grammarAccess.getCompRoleAccess().getMinInstanceNbrKeyword_6_0());
                        
                    // InternalDedalADL.g:1313:1: ( (lv_minInstanceNbr_13_0= RULE_INT ) )
                    // InternalDedalADL.g:1314:1: (lv_minInstanceNbr_13_0= RULE_INT )
                    {
                    // InternalDedalADL.g:1314:1: (lv_minInstanceNbr_13_0= RULE_INT )
                    // InternalDedalADL.g:1315:3: lv_minInstanceNbr_13_0= RULE_INT
                    {
                    lv_minInstanceNbr_13_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_40); 

                    			newLeafNode(lv_minInstanceNbr_13_0, grammarAccess.getCompRoleAccess().getMinInstanceNbrINTTerminalRuleCall_6_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCompRoleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"minInstanceNbr",
                            		lv_minInstanceNbr_13_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDedalADL.g:1331:4: (otherlv_14= 'MaxInstanceNbr' ( (lv_maxInstanceNbr_15_0= RULE_INT ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalDedalADL.g:1331:6: otherlv_14= 'MaxInstanceNbr' ( (lv_maxInstanceNbr_15_0= RULE_INT ) )
                    {
                    otherlv_14=(Token)match(input,38,FollowSets000.FOLLOW_39); 

                        	newLeafNode(otherlv_14, grammarAccess.getCompRoleAccess().getMaxInstanceNbrKeyword_7_0());
                        
                    // InternalDedalADL.g:1335:1: ( (lv_maxInstanceNbr_15_0= RULE_INT ) )
                    // InternalDedalADL.g:1336:1: (lv_maxInstanceNbr_15_0= RULE_INT )
                    {
                    // InternalDedalADL.g:1336:1: (lv_maxInstanceNbr_15_0= RULE_INT )
                    // InternalDedalADL.g:1337:3: lv_maxInstanceNbr_15_0= RULE_INT
                    {
                    lv_maxInstanceNbr_15_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_41); 

                    			newLeafNode(lv_maxInstanceNbr_15_0, grammarAccess.getCompRoleAccess().getMaxInstanceNbrINTTerminalRuleCall_7_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCompRoleRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"maxInstanceNbr",
                            		lv_maxInstanceNbr_15_0, 
                            		"org.eclipse.xtext.common.Terminals.INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDedalADL.g:1353:4: (otherlv_16= 'interactions' ( (lv_compInterfaces_17_0= ruleInteraction ) ) (otherlv_18= ';' ( (lv_compInterfaces_19_0= ruleInteraction ) ) )* )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalDedalADL.g:1353:6: otherlv_16= 'interactions' ( (lv_compInterfaces_17_0= ruleInteraction ) ) (otherlv_18= ';' ( (lv_compInterfaces_19_0= ruleInteraction ) ) )*
                    {
                    otherlv_16=(Token)match(input,39,FollowSets000.FOLLOW_42); 

                        	newLeafNode(otherlv_16, grammarAccess.getCompRoleAccess().getInteractionsKeyword_8_0());
                        
                    // InternalDedalADL.g:1357:1: ( (lv_compInterfaces_17_0= ruleInteraction ) )
                    // InternalDedalADL.g:1358:1: (lv_compInterfaces_17_0= ruleInteraction )
                    {
                    // InternalDedalADL.g:1358:1: (lv_compInterfaces_17_0= ruleInteraction )
                    // InternalDedalADL.g:1359:3: lv_compInterfaces_17_0= ruleInteraction
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompRoleAccess().getCompInterfacesInteractionParserRuleCall_8_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_33);
                    lv_compInterfaces_17_0=ruleInteraction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompRoleRule());
                    	        }
                           		add(
                           			current, 
                           			"compInterfaces",
                            		lv_compInterfaces_17_0, 
                            		"fr.ema.dedal.xtext.DedalADL.Interaction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:1375:2: (otherlv_18= ';' ( (lv_compInterfaces_19_0= ruleInteraction ) ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( (LA36_0==15) ) {
                            int LA36_2 = input.LA(2);

                            if ( (LA36_2==40||LA36_2==73||LA36_2==75) ) {
                                alt36=1;
                            }


                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalDedalADL.g:1375:4: otherlv_18= ';' ( (lv_compInterfaces_19_0= ruleInteraction ) )
                    	    {
                    	    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_42); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getCompRoleAccess().getSemicolonKeyword_8_2_0());
                    	        
                    	    // InternalDedalADL.g:1379:1: ( (lv_compInterfaces_19_0= ruleInteraction ) )
                    	    // InternalDedalADL.g:1380:1: (lv_compInterfaces_19_0= ruleInteraction )
                    	    {
                    	    // InternalDedalADL.g:1380:1: (lv_compInterfaces_19_0= ruleInteraction )
                    	    // InternalDedalADL.g:1381:3: lv_compInterfaces_19_0= ruleInteraction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCompRoleAccess().getCompInterfacesInteractionParserRuleCall_8_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_33);
                    	    lv_compInterfaces_19_0=ruleInteraction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCompRoleRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"compInterfaces",
                    	            		lv_compInterfaces_19_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.Interaction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompRole"


    // $ANTLR start "entryRulecomponent_role_name"
    // InternalDedalADL.g:1405:1: entryRulecomponent_role_name returns [String current=null] : iv_rulecomponent_role_name= rulecomponent_role_name EOF ;
    public final String entryRulecomponent_role_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecomponent_role_name = null;


        try {
            // InternalDedalADL.g:1406:2: (iv_rulecomponent_role_name= rulecomponent_role_name EOF )
            // InternalDedalADL.g:1407:2: iv_rulecomponent_role_name= rulecomponent_role_name EOF
            {
             newCompositeNode(grammarAccess.getComponent_role_nameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulecomponent_role_name=rulecomponent_role_name();

            state._fsp--;

             current =iv_rulecomponent_role_name.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecomponent_role_name"


    // $ANTLR start "rulecomponent_role_name"
    // InternalDedalADL.g:1414:1: rulecomponent_role_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken rulecomponent_role_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:1417:28: (this_ID_0= RULE_ID )
            // InternalDedalADL.g:1418:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getComponent_role_nameAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecomponent_role_name"


    // $ANTLR start "entryRuleInterface"
    // InternalDedalADL.g:1433:1: entryRuleInterface returns [EObject current=null] : iv_ruleInterface= ruleInterface EOF ;
    public final EObject entryRuleInterface() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInterface = null;


        try {
            // InternalDedalADL.g:1434:2: (iv_ruleInterface= ruleInterface EOF )
            // InternalDedalADL.g:1435:2: iv_ruleInterface= ruleInterface EOF
            {
             newCompositeNode(grammarAccess.getInterfaceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInterface=ruleInterface();

            state._fsp--;

             current =iv_ruleInterface; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInterface"


    // $ANTLR start "ruleInterface"
    // InternalDedalADL.g:1442:1: ruleInterface returns [EObject current=null] : (otherlv_0= 'interface' ( (lv_name_1_0= ruleinterface_name ) ) otherlv_2= 'interface_direction' ( (lv_direction_3_0= ruleDIRECTION ) ) otherlv_4= 'implementation' ( ( ruleEString ) ) (otherlv_6= 'delegation' ( ( ruleEString ) ) )? (otherlv_8= 'instantiates' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleInterface() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_direction_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:1445:28: ( (otherlv_0= 'interface' ( (lv_name_1_0= ruleinterface_name ) ) otherlv_2= 'interface_direction' ( (lv_direction_3_0= ruleDIRECTION ) ) otherlv_4= 'implementation' ( ( ruleEString ) ) (otherlv_6= 'delegation' ( ( ruleEString ) ) )? (otherlv_8= 'instantiates' ( ( ruleEString ) ) )? ) )
            // InternalDedalADL.g:1446:1: (otherlv_0= 'interface' ( (lv_name_1_0= ruleinterface_name ) ) otherlv_2= 'interface_direction' ( (lv_direction_3_0= ruleDIRECTION ) ) otherlv_4= 'implementation' ( ( ruleEString ) ) (otherlv_6= 'delegation' ( ( ruleEString ) ) )? (otherlv_8= 'instantiates' ( ( ruleEString ) ) )? )
            {
            // InternalDedalADL.g:1446:1: (otherlv_0= 'interface' ( (lv_name_1_0= ruleinterface_name ) ) otherlv_2= 'interface_direction' ( (lv_direction_3_0= ruleDIRECTION ) ) otherlv_4= 'implementation' ( ( ruleEString ) ) (otherlv_6= 'delegation' ( ( ruleEString ) ) )? (otherlv_8= 'instantiates' ( ( ruleEString ) ) )? )
            // InternalDedalADL.g:1446:3: otherlv_0= 'interface' ( (lv_name_1_0= ruleinterface_name ) ) otherlv_2= 'interface_direction' ( (lv_direction_3_0= ruleDIRECTION ) ) otherlv_4= 'implementation' ( ( ruleEString ) ) (otherlv_6= 'delegation' ( ( ruleEString ) ) )? (otherlv_8= 'instantiates' ( ( ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,40,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_0, grammarAccess.getInterfaceAccess().getInterfaceKeyword_0());
                
            // InternalDedalADL.g:1450:1: ( (lv_name_1_0= ruleinterface_name ) )
            // InternalDedalADL.g:1451:1: (lv_name_1_0= ruleinterface_name )
            {
            // InternalDedalADL.g:1451:1: (lv_name_1_0= ruleinterface_name )
            // InternalDedalADL.g:1452:3: lv_name_1_0= ruleinterface_name
            {
             
            	        newCompositeNode(grammarAccess.getInterfaceAccess().getNameInterface_nameParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_43);
            lv_name_1_0=ruleinterface_name();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.interface_name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,41,FollowSets000.FOLLOW_44); 

                	newLeafNode(otherlv_2, grammarAccess.getInterfaceAccess().getInterface_directionKeyword_2());
                
            // InternalDedalADL.g:1472:1: ( (lv_direction_3_0= ruleDIRECTION ) )
            // InternalDedalADL.g:1473:1: (lv_direction_3_0= ruleDIRECTION )
            {
            // InternalDedalADL.g:1473:1: (lv_direction_3_0= ruleDIRECTION )
            // InternalDedalADL.g:1474:3: lv_direction_3_0= ruleDIRECTION
            {
             
            	        newCompositeNode(grammarAccess.getInterfaceAccess().getDirectionDIRECTIONEnumRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_45);
            lv_direction_3_0=ruleDIRECTION();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInterfaceRule());
            	        }
                   		set(
                   			current, 
                   			"direction",
                    		lv_direction_3_0, 
                    		"fr.ema.dedal.xtext.DedalADL.DIRECTION");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,42,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getInterfaceAccess().getImplementationKeyword_4());
                
            // InternalDedalADL.g:1494:1: ( ( ruleEString ) )
            // InternalDedalADL.g:1495:1: ( ruleEString )
            {
            // InternalDedalADL.g:1495:1: ( ruleEString )
            // InternalDedalADL.g:1496:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInterfaceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInterfaceAccess().getTypeInterfaceTypeCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_46);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:1509:2: (otherlv_6= 'delegation' ( ( ruleEString ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==43) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalDedalADL.g:1509:4: otherlv_6= 'delegation' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,43,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_6, grammarAccess.getInterfaceAccess().getDelegationKeyword_6_0());
                        
                    // InternalDedalADL.g:1513:1: ( ( ruleEString ) )
                    // InternalDedalADL.g:1514:1: ( ruleEString )
                    {
                    // InternalDedalADL.g:1514:1: ( ruleEString )
                    // InternalDedalADL.g:1515:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInterfaceAccess().getDelegationInterfaceCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_47);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDedalADL.g:1528:4: (otherlv_8= 'instantiates' ( ( ruleEString ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalDedalADL.g:1528:6: otherlv_8= 'instantiates' ( ( ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,44,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_8, grammarAccess.getInterfaceAccess().getInstantiatesKeyword_7_0());
                        
                    // InternalDedalADL.g:1532:1: ( ( ruleEString ) )
                    // InternalDedalADL.g:1533:1: ( ruleEString )
                    {
                    // InternalDedalADL.g:1533:1: ( ruleEString )
                    // InternalDedalADL.g:1534:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getInterfaceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getInterfaceAccess().getInstantiatesInterfaceCrossReference_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInterface"


    // $ANTLR start "entryRuleinterface_name"
    // InternalDedalADL.g:1555:1: entryRuleinterface_name returns [String current=null] : iv_ruleinterface_name= ruleinterface_name EOF ;
    public final String entryRuleinterface_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinterface_name = null;


        try {
            // InternalDedalADL.g:1556:2: (iv_ruleinterface_name= ruleinterface_name EOF )
            // InternalDedalADL.g:1557:2: iv_ruleinterface_name= ruleinterface_name EOF
            {
             newCompositeNode(grammarAccess.getInterface_nameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleinterface_name=ruleinterface_name();

            state._fsp--;

             current =iv_ruleinterface_name.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinterface_name"


    // $ANTLR start "ruleinterface_name"
    // InternalDedalADL.g:1564:1: ruleinterface_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleinterface_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:1567:28: (this_ID_0= RULE_ID )
            // InternalDedalADL.g:1568:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getInterface_nameAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinterface_name"


    // $ANTLR start "entryRuleRoleConnection"
    // InternalDedalADL.g:1583:1: entryRuleRoleConnection returns [EObject current=null] : iv_ruleRoleConnection= ruleRoleConnection EOF ;
    public final EObject entryRuleRoleConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRoleConnection = null;


        try {
            // InternalDedalADL.g:1584:2: (iv_ruleRoleConnection= ruleRoleConnection EOF )
            // InternalDedalADL.g:1585:2: iv_ruleRoleConnection= ruleRoleConnection EOF
            {
             newCompositeNode(grammarAccess.getRoleConnectionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRoleConnection=ruleRoleConnection();

            state._fsp--;

             current =iv_ruleRoleConnection; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRoleConnection"


    // $ANTLR start "ruleRoleConnection"
    // InternalDedalADL.g:1592:1: ruleRoleConnection returns [EObject current=null] : (otherlv_0= 'connection' ( (lv_refID_1_0= ruleEString ) ) otherlv_2= 'client' ( ( ruleEString ) ) otherlv_4= '.' ( ( ruleEString ) ) otherlv_6= 'server' ( ( ruleEString ) ) otherlv_8= '.' ( ( ruleEString ) ) ) ;
    public final EObject ruleRoleConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_refID_1_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:1595:28: ( (otherlv_0= 'connection' ( (lv_refID_1_0= ruleEString ) ) otherlv_2= 'client' ( ( ruleEString ) ) otherlv_4= '.' ( ( ruleEString ) ) otherlv_6= 'server' ( ( ruleEString ) ) otherlv_8= '.' ( ( ruleEString ) ) ) )
            // InternalDedalADL.g:1596:1: (otherlv_0= 'connection' ( (lv_refID_1_0= ruleEString ) ) otherlv_2= 'client' ( ( ruleEString ) ) otherlv_4= '.' ( ( ruleEString ) ) otherlv_6= 'server' ( ( ruleEString ) ) otherlv_8= '.' ( ( ruleEString ) ) )
            {
            // InternalDedalADL.g:1596:1: (otherlv_0= 'connection' ( (lv_refID_1_0= ruleEString ) ) otherlv_2= 'client' ( ( ruleEString ) ) otherlv_4= '.' ( ( ruleEString ) ) otherlv_6= 'server' ( ( ruleEString ) ) otherlv_8= '.' ( ( ruleEString ) ) )
            // InternalDedalADL.g:1596:3: otherlv_0= 'connection' ( (lv_refID_1_0= ruleEString ) ) otherlv_2= 'client' ( ( ruleEString ) ) otherlv_4= '.' ( ( ruleEString ) ) otherlv_6= 'server' ( ( ruleEString ) ) otherlv_8= '.' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,45,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getRoleConnectionAccess().getConnectionKeyword_0());
                
            // InternalDedalADL.g:1600:1: ( (lv_refID_1_0= ruleEString ) )
            // InternalDedalADL.g:1601:1: (lv_refID_1_0= ruleEString )
            {
            // InternalDedalADL.g:1601:1: (lv_refID_1_0= ruleEString )
            // InternalDedalADL.g:1602:3: lv_refID_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRoleConnectionAccess().getRefIDEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_48);
            lv_refID_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRoleConnectionRule());
            	        }
                   		set(
                   			current, 
                   			"refID",
                    		lv_refID_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getRoleConnectionAccess().getClientKeyword_2());
                
            // InternalDedalADL.g:1622:1: ( ( ruleEString ) )
            // InternalDedalADL.g:1623:1: ( ruleEString )
            {
            // InternalDedalADL.g:1623:1: ( ruleEString )
            // InternalDedalADL.g:1624:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleConnectionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRoleConnectionAccess().getClientCompElemCompRoleCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_49);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,47,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getRoleConnectionAccess().getFullStopKeyword_4());
                
            // InternalDedalADL.g:1641:1: ( ( ruleEString ) )
            // InternalDedalADL.g:1642:1: ( ruleEString )
            {
            // InternalDedalADL.g:1642:1: ( ruleEString )
            // InternalDedalADL.g:1643:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleConnectionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRoleConnectionAccess().getClientIntElemInteractionCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_50);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,48,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_6, grammarAccess.getRoleConnectionAccess().getServerKeyword_6());
                
            // InternalDedalADL.g:1660:1: ( ( ruleEString ) )
            // InternalDedalADL.g:1661:1: ( ruleEString )
            {
            // InternalDedalADL.g:1661:1: ( ruleEString )
            // InternalDedalADL.g:1662:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleConnectionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRoleConnectionAccess().getServerCompElemCompRoleCrossReference_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_49);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,47,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_8, grammarAccess.getRoleConnectionAccess().getFullStopKeyword_8());
                
            // InternalDedalADL.g:1679:1: ( ( ruleEString ) )
            // InternalDedalADL.g:1680:1: ( ruleEString )
            {
            // InternalDedalADL.g:1680:1: ( ruleEString )
            // InternalDedalADL.g:1681:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRoleConnectionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRoleConnectionAccess().getServerIntElemInteractionCrossReference_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRoleConnection"


    // $ANTLR start "entryRuleconnection_name"
    // InternalDedalADL.g:1702:1: entryRuleconnection_name returns [String current=null] : iv_ruleconnection_name= ruleconnection_name EOF ;
    public final String entryRuleconnection_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconnection_name = null;


        try {
            // InternalDedalADL.g:1703:2: (iv_ruleconnection_name= ruleconnection_name EOF )
            // InternalDedalADL.g:1704:2: iv_ruleconnection_name= ruleconnection_name EOF
            {
             newCompositeNode(grammarAccess.getConnection_nameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleconnection_name=ruleconnection_name();

            state._fsp--;

             current =iv_ruleconnection_name.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconnection_name"


    // $ANTLR start "ruleconnection_name"
    // InternalDedalADL.g:1711:1: ruleconnection_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleconnection_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:1714:28: (this_ID_0= RULE_ID )
            // InternalDedalADL.g:1715:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getConnection_nameAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconnection_name"


    // $ANTLR start "entryRuleConfiguration"
    // InternalDedalADL.g:1730:1: entryRuleConfiguration returns [EObject current=null] : iv_ruleConfiguration= ruleConfiguration EOF ;
    public final EObject entryRuleConfiguration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConfiguration = null;


        try {
            // InternalDedalADL.g:1731:2: (iv_ruleConfiguration= ruleConfiguration EOF )
            // InternalDedalADL.g:1732:2: iv_ruleConfiguration= ruleConfiguration EOF
            {
             newCompositeNode(grammarAccess.getConfigurationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConfiguration=ruleConfiguration();

            state._fsp--;

             current =iv_ruleConfiguration; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConfiguration"


    // $ANTLR start "ruleConfiguration"
    // InternalDedalADL.g:1739:1: ruleConfiguration returns [EObject current=null] : (otherlv_0= 'configuration' ( (lv_name_1_0= ruleconfiguration_name ) ) (otherlv_2= 'implements' ( ( ruleEString ) ) (otherlv_4= '(' this_REVISION_NUMB_5= RULE_REVISION_NUMB otherlv_6= ')' )? (otherlv_7= ';' ( ( ruleEString ) ) otherlv_9= '(' this_REVISION_NUMB_10= RULE_REVISION_NUMB otherlv_11= ')' )* )? (otherlv_12= 'versionID' this_REVISION_NUMB_13= RULE_REVISION_NUMB )? (otherlv_14= 'pre_version' rulepre_version )? (otherlv_16= 'by' rulechange )? (otherlv_18= 'component_classes' ( (lv_configComponents_19_0= ruleCompClass ) ) (otherlv_20= ';' ( (lv_configComponents_21_0= ruleCompClass ) ) )* )? (otherlv_22= 'connector_classes' ruleconnector_class otherlv_24= 'as' ruleconnection_name (otherlv_26= ';' ruleconnector_class otherlv_28= 'as' ruleconnection_name )* )? (otherlv_30= 'interface_types' otherlv_31= '(' ( (lv_interfaceTypes_32_0= ruleInterfaceType ) ) (otherlv_33= ';' ( (lv_interfaceTypes_34_0= ruleInterfaceType ) ) )* otherlv_35= ')' )? (otherlv_36= 'component_types' otherlv_37= '(' ( (lv_comptypes_38_0= ruleCompType ) ) (otherlv_39= ';' ( (lv_comptypes_40_0= ruleCompType ) ) )* otherlv_41= ')' )? (otherlv_42= 'configConnections' otherlv_43= '(' ( (lv_configConnections_44_0= ruleClassConnection ) ) (otherlv_45= ';' ( (lv_configConnections_46_0= ruleClassConnection ) ) )* otherlv_47= ')' )? ) ;
    public final EObject ruleConfiguration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_REVISION_NUMB_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token this_REVISION_NUMB_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token this_REVISION_NUMB_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_configComponents_19_0 = null;

        EObject lv_configComponents_21_0 = null;

        EObject lv_interfaceTypes_32_0 = null;

        EObject lv_interfaceTypes_34_0 = null;

        EObject lv_comptypes_38_0 = null;

        EObject lv_comptypes_40_0 = null;

        EObject lv_configConnections_44_0 = null;

        EObject lv_configConnections_46_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:1742:28: ( (otherlv_0= 'configuration' ( (lv_name_1_0= ruleconfiguration_name ) ) (otherlv_2= 'implements' ( ( ruleEString ) ) (otherlv_4= '(' this_REVISION_NUMB_5= RULE_REVISION_NUMB otherlv_6= ')' )? (otherlv_7= ';' ( ( ruleEString ) ) otherlv_9= '(' this_REVISION_NUMB_10= RULE_REVISION_NUMB otherlv_11= ')' )* )? (otherlv_12= 'versionID' this_REVISION_NUMB_13= RULE_REVISION_NUMB )? (otherlv_14= 'pre_version' rulepre_version )? (otherlv_16= 'by' rulechange )? (otherlv_18= 'component_classes' ( (lv_configComponents_19_0= ruleCompClass ) ) (otherlv_20= ';' ( (lv_configComponents_21_0= ruleCompClass ) ) )* )? (otherlv_22= 'connector_classes' ruleconnector_class otherlv_24= 'as' ruleconnection_name (otherlv_26= ';' ruleconnector_class otherlv_28= 'as' ruleconnection_name )* )? (otherlv_30= 'interface_types' otherlv_31= '(' ( (lv_interfaceTypes_32_0= ruleInterfaceType ) ) (otherlv_33= ';' ( (lv_interfaceTypes_34_0= ruleInterfaceType ) ) )* otherlv_35= ')' )? (otherlv_36= 'component_types' otherlv_37= '(' ( (lv_comptypes_38_0= ruleCompType ) ) (otherlv_39= ';' ( (lv_comptypes_40_0= ruleCompType ) ) )* otherlv_41= ')' )? (otherlv_42= 'configConnections' otherlv_43= '(' ( (lv_configConnections_44_0= ruleClassConnection ) ) (otherlv_45= ';' ( (lv_configConnections_46_0= ruleClassConnection ) ) )* otherlv_47= ')' )? ) )
            // InternalDedalADL.g:1743:1: (otherlv_0= 'configuration' ( (lv_name_1_0= ruleconfiguration_name ) ) (otherlv_2= 'implements' ( ( ruleEString ) ) (otherlv_4= '(' this_REVISION_NUMB_5= RULE_REVISION_NUMB otherlv_6= ')' )? (otherlv_7= ';' ( ( ruleEString ) ) otherlv_9= '(' this_REVISION_NUMB_10= RULE_REVISION_NUMB otherlv_11= ')' )* )? (otherlv_12= 'versionID' this_REVISION_NUMB_13= RULE_REVISION_NUMB )? (otherlv_14= 'pre_version' rulepre_version )? (otherlv_16= 'by' rulechange )? (otherlv_18= 'component_classes' ( (lv_configComponents_19_0= ruleCompClass ) ) (otherlv_20= ';' ( (lv_configComponents_21_0= ruleCompClass ) ) )* )? (otherlv_22= 'connector_classes' ruleconnector_class otherlv_24= 'as' ruleconnection_name (otherlv_26= ';' ruleconnector_class otherlv_28= 'as' ruleconnection_name )* )? (otherlv_30= 'interface_types' otherlv_31= '(' ( (lv_interfaceTypes_32_0= ruleInterfaceType ) ) (otherlv_33= ';' ( (lv_interfaceTypes_34_0= ruleInterfaceType ) ) )* otherlv_35= ')' )? (otherlv_36= 'component_types' otherlv_37= '(' ( (lv_comptypes_38_0= ruleCompType ) ) (otherlv_39= ';' ( (lv_comptypes_40_0= ruleCompType ) ) )* otherlv_41= ')' )? (otherlv_42= 'configConnections' otherlv_43= '(' ( (lv_configConnections_44_0= ruleClassConnection ) ) (otherlv_45= ';' ( (lv_configConnections_46_0= ruleClassConnection ) ) )* otherlv_47= ')' )? )
            {
            // InternalDedalADL.g:1743:1: (otherlv_0= 'configuration' ( (lv_name_1_0= ruleconfiguration_name ) ) (otherlv_2= 'implements' ( ( ruleEString ) ) (otherlv_4= '(' this_REVISION_NUMB_5= RULE_REVISION_NUMB otherlv_6= ')' )? (otherlv_7= ';' ( ( ruleEString ) ) otherlv_9= '(' this_REVISION_NUMB_10= RULE_REVISION_NUMB otherlv_11= ')' )* )? (otherlv_12= 'versionID' this_REVISION_NUMB_13= RULE_REVISION_NUMB )? (otherlv_14= 'pre_version' rulepre_version )? (otherlv_16= 'by' rulechange )? (otherlv_18= 'component_classes' ( (lv_configComponents_19_0= ruleCompClass ) ) (otherlv_20= ';' ( (lv_configComponents_21_0= ruleCompClass ) ) )* )? (otherlv_22= 'connector_classes' ruleconnector_class otherlv_24= 'as' ruleconnection_name (otherlv_26= ';' ruleconnector_class otherlv_28= 'as' ruleconnection_name )* )? (otherlv_30= 'interface_types' otherlv_31= '(' ( (lv_interfaceTypes_32_0= ruleInterfaceType ) ) (otherlv_33= ';' ( (lv_interfaceTypes_34_0= ruleInterfaceType ) ) )* otherlv_35= ')' )? (otherlv_36= 'component_types' otherlv_37= '(' ( (lv_comptypes_38_0= ruleCompType ) ) (otherlv_39= ';' ( (lv_comptypes_40_0= ruleCompType ) ) )* otherlv_41= ')' )? (otherlv_42= 'configConnections' otherlv_43= '(' ( (lv_configConnections_44_0= ruleClassConnection ) ) (otherlv_45= ';' ( (lv_configConnections_46_0= ruleClassConnection ) ) )* otherlv_47= ')' )? )
            // InternalDedalADL.g:1743:3: otherlv_0= 'configuration' ( (lv_name_1_0= ruleconfiguration_name ) ) (otherlv_2= 'implements' ( ( ruleEString ) ) (otherlv_4= '(' this_REVISION_NUMB_5= RULE_REVISION_NUMB otherlv_6= ')' )? (otherlv_7= ';' ( ( ruleEString ) ) otherlv_9= '(' this_REVISION_NUMB_10= RULE_REVISION_NUMB otherlv_11= ')' )* )? (otherlv_12= 'versionID' this_REVISION_NUMB_13= RULE_REVISION_NUMB )? (otherlv_14= 'pre_version' rulepre_version )? (otherlv_16= 'by' rulechange )? (otherlv_18= 'component_classes' ( (lv_configComponents_19_0= ruleCompClass ) ) (otherlv_20= ';' ( (lv_configComponents_21_0= ruleCompClass ) ) )* )? (otherlv_22= 'connector_classes' ruleconnector_class otherlv_24= 'as' ruleconnection_name (otherlv_26= ';' ruleconnector_class otherlv_28= 'as' ruleconnection_name )* )? (otherlv_30= 'interface_types' otherlv_31= '(' ( (lv_interfaceTypes_32_0= ruleInterfaceType ) ) (otherlv_33= ';' ( (lv_interfaceTypes_34_0= ruleInterfaceType ) ) )* otherlv_35= ')' )? (otherlv_36= 'component_types' otherlv_37= '(' ( (lv_comptypes_38_0= ruleCompType ) ) (otherlv_39= ';' ( (lv_comptypes_40_0= ruleCompType ) ) )* otherlv_41= ')' )? (otherlv_42= 'configConnections' otherlv_43= '(' ( (lv_configConnections_44_0= ruleClassConnection ) ) (otherlv_45= ';' ( (lv_configConnections_46_0= ruleClassConnection ) ) )* otherlv_47= ')' )?
            {
            otherlv_0=(Token)match(input,49,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_0, grammarAccess.getConfigurationAccess().getConfigurationKeyword_0());
                
            // InternalDedalADL.g:1747:1: ( (lv_name_1_0= ruleconfiguration_name ) )
            // InternalDedalADL.g:1748:1: (lv_name_1_0= ruleconfiguration_name )
            {
            // InternalDedalADL.g:1748:1: (lv_name_1_0= ruleconfiguration_name )
            // InternalDedalADL.g:1749:3: lv_name_1_0= ruleconfiguration_name
            {
             
            	        newCompositeNode(grammarAccess.getConfigurationAccess().getNameConfiguration_nameParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_51);
            lv_name_1_0=ruleconfiguration_name();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.configuration_name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:1765:2: (otherlv_2= 'implements' ( ( ruleEString ) ) (otherlv_4= '(' this_REVISION_NUMB_5= RULE_REVISION_NUMB otherlv_6= ')' )? (otherlv_7= ';' ( ( ruleEString ) ) otherlv_9= '(' this_REVISION_NUMB_10= RULE_REVISION_NUMB otherlv_11= ')' )* )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==50) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalDedalADL.g:1765:4: otherlv_2= 'implements' ( ( ruleEString ) ) (otherlv_4= '(' this_REVISION_NUMB_5= RULE_REVISION_NUMB otherlv_6= ')' )? (otherlv_7= ';' ( ( ruleEString ) ) otherlv_9= '(' this_REVISION_NUMB_10= RULE_REVISION_NUMB otherlv_11= ')' )*
                    {
                    otherlv_2=(Token)match(input,50,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getConfigurationAccess().getImplementsKeyword_2_0());
                        
                    // InternalDedalADL.g:1769:1: ( ( ruleEString ) )
                    // InternalDedalADL.g:1770:1: ( ruleEString )
                    {
                    // InternalDedalADL.g:1770:1: ( ruleEString )
                    // InternalDedalADL.g:1771:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConfigurationRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getConfigurationAccess().getImplementsSpecificationCrossReference_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_52);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:1784:2: (otherlv_4= '(' this_REVISION_NUMB_5= RULE_REVISION_NUMB otherlv_6= ')' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==14) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalDedalADL.g:1784:4: otherlv_4= '(' this_REVISION_NUMB_5= RULE_REVISION_NUMB otherlv_6= ')'
                            {
                            otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_28); 

                                	newLeafNode(otherlv_4, grammarAccess.getConfigurationAccess().getLeftParenthesisKeyword_2_2_0());
                                
                            this_REVISION_NUMB_5=(Token)match(input,RULE_REVISION_NUMB,FollowSets000.FOLLOW_53); 
                             
                                newLeafNode(this_REVISION_NUMB_5, grammarAccess.getConfigurationAccess().getREVISION_NUMBTerminalRuleCall_2_2_1()); 
                                
                            otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_54); 

                                	newLeafNode(otherlv_6, grammarAccess.getConfigurationAccess().getRightParenthesisKeyword_2_2_2());
                                

                            }
                            break;

                    }

                    // InternalDedalADL.g:1796:3: (otherlv_7= ';' ( ( ruleEString ) ) otherlv_9= '(' this_REVISION_NUMB_10= RULE_REVISION_NUMB otherlv_11= ')' )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==15) ) {
                            int LA41_2 = input.LA(2);

                            if ( ((LA41_2>=RULE_STRING && LA41_2<=RULE_ID)) ) {
                                alt41=1;
                            }


                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalDedalADL.g:1796:5: otherlv_7= ';' ( ( ruleEString ) ) otherlv_9= '(' this_REVISION_NUMB_10= RULE_REVISION_NUMB otherlv_11= ')'
                    	    {
                    	    otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_3); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getConfigurationAccess().getSemicolonKeyword_2_3_0());
                    	        
                    	    // InternalDedalADL.g:1800:1: ( ( ruleEString ) )
                    	    // InternalDedalADL.g:1801:1: ( ruleEString )
                    	    {
                    	    // InternalDedalADL.g:1801:1: ( ruleEString )
                    	    // InternalDedalADL.g:1802:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getConfigurationRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getConfigurationAccess().getImplementsSpecificationCrossReference_2_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_5);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }

                    	    otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_28); 

                    	        	newLeafNode(otherlv_9, grammarAccess.getConfigurationAccess().getLeftParenthesisKeyword_2_3_2());
                    	        
                    	    this_REVISION_NUMB_10=(Token)match(input,RULE_REVISION_NUMB,FollowSets000.FOLLOW_53); 
                    	     
                    	        newLeafNode(this_REVISION_NUMB_10, grammarAccess.getConfigurationAccess().getREVISION_NUMBTerminalRuleCall_2_3_3()); 
                    	        
                    	    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_54); 

                    	        	newLeafNode(otherlv_11, grammarAccess.getConfigurationAccess().getRightParenthesisKeyword_2_3_4());
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop41;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDedalADL.g:1827:5: (otherlv_12= 'versionID' this_REVISION_NUMB_13= RULE_REVISION_NUMB )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==30) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalDedalADL.g:1827:7: otherlv_12= 'versionID' this_REVISION_NUMB_13= RULE_REVISION_NUMB
                    {
                    otherlv_12=(Token)match(input,30,FollowSets000.FOLLOW_28); 

                        	newLeafNode(otherlv_12, grammarAccess.getConfigurationAccess().getVersionIDKeyword_3_0());
                        
                    this_REVISION_NUMB_13=(Token)match(input,RULE_REVISION_NUMB,FollowSets000.FOLLOW_55); 
                     
                        newLeafNode(this_REVISION_NUMB_13, grammarAccess.getConfigurationAccess().getREVISION_NUMBTerminalRuleCall_3_1()); 
                        

                    }
                    break;

            }

            // InternalDedalADL.g:1835:3: (otherlv_14= 'pre_version' rulepre_version )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==31) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalDedalADL.g:1835:5: otherlv_14= 'pre_version' rulepre_version
                    {
                    otherlv_14=(Token)match(input,31,FollowSets000.FOLLOW_30); 

                        	newLeafNode(otherlv_14, grammarAccess.getConfigurationAccess().getPre_versionKeyword_4_0());
                        
                     
                            newCompositeNode(grammarAccess.getConfigurationAccess().getPre_versionParserRuleCall_4_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_56);
                    rulepre_version();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // InternalDedalADL.g:1847:3: (otherlv_16= 'by' rulechange )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==32) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalDedalADL.g:1847:5: otherlv_16= 'by' rulechange
                    {
                    otherlv_16=(Token)match(input,32,FollowSets000.FOLLOW_32); 

                        	newLeafNode(otherlv_16, grammarAccess.getConfigurationAccess().getByKeyword_5_0());
                        
                     
                            newCompositeNode(grammarAccess.getConfigurationAccess().getChangeParserRuleCall_5_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_57);
                    rulechange();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // InternalDedalADL.g:1859:3: (otherlv_18= 'component_classes' ( (lv_configComponents_19_0= ruleCompClass ) ) (otherlv_20= ';' ( (lv_configComponents_21_0= ruleCompClass ) ) )* )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==51) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalDedalADL.g:1859:5: otherlv_18= 'component_classes' ( (lv_configComponents_19_0= ruleCompClass ) ) (otherlv_20= ';' ( (lv_configComponents_21_0= ruleCompClass ) ) )*
                    {
                    otherlv_18=(Token)match(input,51,FollowSets000.FOLLOW_58); 

                        	newLeafNode(otherlv_18, grammarAccess.getConfigurationAccess().getComponent_classesKeyword_6_0());
                        
                    // InternalDedalADL.g:1863:1: ( (lv_configComponents_19_0= ruleCompClass ) )
                    // InternalDedalADL.g:1864:1: (lv_configComponents_19_0= ruleCompClass )
                    {
                    // InternalDedalADL.g:1864:1: (lv_configComponents_19_0= ruleCompClass )
                    // InternalDedalADL.g:1865:3: lv_configComponents_19_0= ruleCompClass
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationAccess().getConfigComponentsCompClassParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_59);
                    lv_configComponents_19_0=ruleCompClass();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	        }
                           		add(
                           			current, 
                           			"configComponents",
                            		lv_configComponents_19_0, 
                            		"fr.ema.dedal.xtext.DedalADL.CompClass");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:1881:2: (otherlv_20= ';' ( (lv_configComponents_21_0= ruleCompClass ) ) )*
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( (LA46_0==15) ) {
                            int LA46_2 = input.LA(2);

                            if ( (LA46_2==57||LA46_2==61) ) {
                                alt46=1;
                            }


                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalDedalADL.g:1881:4: otherlv_20= ';' ( (lv_configComponents_21_0= ruleCompClass ) )
                    	    {
                    	    otherlv_20=(Token)match(input,15,FollowSets000.FOLLOW_58); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getConfigurationAccess().getSemicolonKeyword_6_2_0());
                    	        
                    	    // InternalDedalADL.g:1885:1: ( (lv_configComponents_21_0= ruleCompClass ) )
                    	    // InternalDedalADL.g:1886:1: (lv_configComponents_21_0= ruleCompClass )
                    	    {
                    	    // InternalDedalADL.g:1886:1: (lv_configComponents_21_0= ruleCompClass )
                    	    // InternalDedalADL.g:1887:3: lv_configComponents_21_0= ruleCompClass
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConfigurationAccess().getConfigComponentsCompClassParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_59);
                    	    lv_configComponents_21_0=ruleCompClass();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"configComponents",
                    	            		lv_configComponents_21_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.CompClass");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop46;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDedalADL.g:1903:6: (otherlv_22= 'connector_classes' ruleconnector_class otherlv_24= 'as' ruleconnection_name (otherlv_26= ';' ruleconnector_class otherlv_28= 'as' ruleconnection_name )* )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==52) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalDedalADL.g:1903:8: otherlv_22= 'connector_classes' ruleconnector_class otherlv_24= 'as' ruleconnection_name (otherlv_26= ';' ruleconnector_class otherlv_28= 'as' ruleconnection_name )*
                    {
                    otherlv_22=(Token)match(input,52,FollowSets000.FOLLOW_60); 

                        	newLeafNode(otherlv_22, grammarAccess.getConfigurationAccess().getConnector_classesKeyword_7_0());
                        
                     
                            newCompositeNode(grammarAccess.getConfigurationAccess().getConnector_classParserRuleCall_7_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_61);
                    ruleconnector_class();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    otherlv_24=(Token)match(input,53,FollowSets000.FOLLOW_22); 

                        	newLeafNode(otherlv_24, grammarAccess.getConfigurationAccess().getAsKeyword_7_2());
                        
                     
                            newCompositeNode(grammarAccess.getConfigurationAccess().getConnection_nameParserRuleCall_7_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_62);
                    ruleconnection_name();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // InternalDedalADL.g:1927:1: (otherlv_26= ';' ruleconnector_class otherlv_28= 'as' ruleconnection_name )*
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( (LA48_0==15) ) {
                            int LA48_2 = input.LA(2);

                            if ( (LA48_2==70) ) {
                                alt48=1;
                            }


                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalDedalADL.g:1927:3: otherlv_26= ';' ruleconnector_class otherlv_28= 'as' ruleconnection_name
                    	    {
                    	    otherlv_26=(Token)match(input,15,FollowSets000.FOLLOW_60); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getConfigurationAccess().getSemicolonKeyword_7_4_0());
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getConfigurationAccess().getConnector_classParserRuleCall_7_4_1()); 
                    	        
                    	    pushFollow(FollowSets000.FOLLOW_61);
                    	    ruleconnector_class();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    otherlv_28=(Token)match(input,53,FollowSets000.FOLLOW_22); 

                    	        	newLeafNode(otherlv_28, grammarAccess.getConfigurationAccess().getAsKeyword_7_4_2());
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getConfigurationAccess().getConnection_nameParserRuleCall_7_4_3()); 
                    	        
                    	    pushFollow(FollowSets000.FOLLOW_62);
                    	    ruleconnection_name();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop48;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDedalADL.g:1951:5: (otherlv_30= 'interface_types' otherlv_31= '(' ( (lv_interfaceTypes_32_0= ruleInterfaceType ) ) (otherlv_33= ';' ( (lv_interfaceTypes_34_0= ruleInterfaceType ) ) )* otherlv_35= ')' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==20) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalDedalADL.g:1951:7: otherlv_30= 'interface_types' otherlv_31= '(' ( (lv_interfaceTypes_32_0= ruleInterfaceType ) ) (otherlv_33= ';' ( (lv_interfaceTypes_34_0= ruleInterfaceType ) ) )* otherlv_35= ')'
                    {
                    otherlv_30=(Token)match(input,20,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_30, grammarAccess.getConfigurationAccess().getInterface_typesKeyword_8_0());
                        
                    otherlv_31=(Token)match(input,14,FollowSets000.FOLLOW_13); 

                        	newLeafNode(otherlv_31, grammarAccess.getConfigurationAccess().getLeftParenthesisKeyword_8_1());
                        
                    // InternalDedalADL.g:1959:1: ( (lv_interfaceTypes_32_0= ruleInterfaceType ) )
                    // InternalDedalADL.g:1960:1: (lv_interfaceTypes_32_0= ruleInterfaceType )
                    {
                    // InternalDedalADL.g:1960:1: (lv_interfaceTypes_32_0= ruleInterfaceType )
                    // InternalDedalADL.g:1961:3: lv_interfaceTypes_32_0= ruleInterfaceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationAccess().getInterfaceTypesInterfaceTypeParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_interfaceTypes_32_0=ruleInterfaceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	        }
                           		add(
                           			current, 
                           			"interfaceTypes",
                            		lv_interfaceTypes_32_0, 
                            		"fr.ema.dedal.xtext.DedalADL.InterfaceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:1977:2: (otherlv_33= ';' ( (lv_interfaceTypes_34_0= ruleInterfaceType ) ) )*
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( (LA50_0==15) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalDedalADL.g:1977:4: otherlv_33= ';' ( (lv_interfaceTypes_34_0= ruleInterfaceType ) )
                    	    {
                    	    otherlv_33=(Token)match(input,15,FollowSets000.FOLLOW_13); 

                    	        	newLeafNode(otherlv_33, grammarAccess.getConfigurationAccess().getSemicolonKeyword_8_3_0());
                    	        
                    	    // InternalDedalADL.g:1981:1: ( (lv_interfaceTypes_34_0= ruleInterfaceType ) )
                    	    // InternalDedalADL.g:1982:1: (lv_interfaceTypes_34_0= ruleInterfaceType )
                    	    {
                    	    // InternalDedalADL.g:1982:1: (lv_interfaceTypes_34_0= ruleInterfaceType )
                    	    // InternalDedalADL.g:1983:3: lv_interfaceTypes_34_0= ruleInterfaceType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConfigurationAccess().getInterfaceTypesInterfaceTypeParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_interfaceTypes_34_0=ruleInterfaceType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"interfaceTypes",
                    	            		lv_interfaceTypes_34_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.InterfaceType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop50;
                        }
                    } while (true);

                    otherlv_35=(Token)match(input,16,FollowSets000.FOLLOW_63); 

                        	newLeafNode(otherlv_35, grammarAccess.getConfigurationAccess().getRightParenthesisKeyword_8_4());
                        

                    }
                    break;

            }

            // InternalDedalADL.g:2003:3: (otherlv_36= 'component_types' otherlv_37= '(' ( (lv_comptypes_38_0= ruleCompType ) ) (otherlv_39= ';' ( (lv_comptypes_40_0= ruleCompType ) ) )* otherlv_41= ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==54) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalDedalADL.g:2003:5: otherlv_36= 'component_types' otherlv_37= '(' ( (lv_comptypes_38_0= ruleCompType ) ) (otherlv_39= ';' ( (lv_comptypes_40_0= ruleCompType ) ) )* otherlv_41= ')'
                    {
                    otherlv_36=(Token)match(input,54,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_36, grammarAccess.getConfigurationAccess().getComponent_typesKeyword_9_0());
                        
                    otherlv_37=(Token)match(input,14,FollowSets000.FOLLOW_11); 

                        	newLeafNode(otherlv_37, grammarAccess.getConfigurationAccess().getLeftParenthesisKeyword_9_1());
                        
                    // InternalDedalADL.g:2011:1: ( (lv_comptypes_38_0= ruleCompType ) )
                    // InternalDedalADL.g:2012:1: (lv_comptypes_38_0= ruleCompType )
                    {
                    // InternalDedalADL.g:2012:1: (lv_comptypes_38_0= ruleCompType )
                    // InternalDedalADL.g:2013:3: lv_comptypes_38_0= ruleCompType
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationAccess().getComptypesCompTypeParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_comptypes_38_0=ruleCompType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	        }
                           		add(
                           			current, 
                           			"comptypes",
                            		lv_comptypes_38_0, 
                            		"fr.ema.dedal.xtext.DedalADL.CompType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:2029:2: (otherlv_39= ';' ( (lv_comptypes_40_0= ruleCompType ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==15) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalDedalADL.g:2029:4: otherlv_39= ';' ( (lv_comptypes_40_0= ruleCompType ) )
                    	    {
                    	    otherlv_39=(Token)match(input,15,FollowSets000.FOLLOW_11); 

                    	        	newLeafNode(otherlv_39, grammarAccess.getConfigurationAccess().getSemicolonKeyword_9_3_0());
                    	        
                    	    // InternalDedalADL.g:2033:1: ( (lv_comptypes_40_0= ruleCompType ) )
                    	    // InternalDedalADL.g:2034:1: (lv_comptypes_40_0= ruleCompType )
                    	    {
                    	    // InternalDedalADL.g:2034:1: (lv_comptypes_40_0= ruleCompType )
                    	    // InternalDedalADL.g:2035:3: lv_comptypes_40_0= ruleCompType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConfigurationAccess().getComptypesCompTypeParserRuleCall_9_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_comptypes_40_0=ruleCompType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"comptypes",
                    	            		lv_comptypes_40_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.CompType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_41=(Token)match(input,16,FollowSets000.FOLLOW_64); 

                        	newLeafNode(otherlv_41, grammarAccess.getConfigurationAccess().getRightParenthesisKeyword_9_4());
                        

                    }
                    break;

            }

            // InternalDedalADL.g:2055:3: (otherlv_42= 'configConnections' otherlv_43= '(' ( (lv_configConnections_44_0= ruleClassConnection ) ) (otherlv_45= ';' ( (lv_configConnections_46_0= ruleClassConnection ) ) )* otherlv_47= ')' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==55) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalDedalADL.g:2055:5: otherlv_42= 'configConnections' otherlv_43= '(' ( (lv_configConnections_44_0= ruleClassConnection ) ) (otherlv_45= ';' ( (lv_configConnections_46_0= ruleClassConnection ) ) )* otherlv_47= ')'
                    {
                    otherlv_42=(Token)match(input,55,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_42, grammarAccess.getConfigurationAccess().getConfigConnectionsKeyword_10_0());
                        
                    otherlv_43=(Token)match(input,14,FollowSets000.FOLLOW_65); 

                        	newLeafNode(otherlv_43, grammarAccess.getConfigurationAccess().getLeftParenthesisKeyword_10_1());
                        
                    // InternalDedalADL.g:2063:1: ( (lv_configConnections_44_0= ruleClassConnection ) )
                    // InternalDedalADL.g:2064:1: (lv_configConnections_44_0= ruleClassConnection )
                    {
                    // InternalDedalADL.g:2064:1: (lv_configConnections_44_0= ruleClassConnection )
                    // InternalDedalADL.g:2065:3: lv_configConnections_44_0= ruleClassConnection
                    {
                     
                    	        newCompositeNode(grammarAccess.getConfigurationAccess().getConfigConnectionsClassConnectionParserRuleCall_10_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_configConnections_44_0=ruleClassConnection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	        }
                           		add(
                           			current, 
                           			"configConnections",
                            		lv_configConnections_44_0, 
                            		"fr.ema.dedal.xtext.DedalADL.ClassConnection");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:2081:2: (otherlv_45= ';' ( (lv_configConnections_46_0= ruleClassConnection ) ) )*
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( (LA54_0==15) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalDedalADL.g:2081:4: otherlv_45= ';' ( (lv_configConnections_46_0= ruleClassConnection ) )
                    	    {
                    	    otherlv_45=(Token)match(input,15,FollowSets000.FOLLOW_65); 

                    	        	newLeafNode(otherlv_45, grammarAccess.getConfigurationAccess().getSemicolonKeyword_10_3_0());
                    	        
                    	    // InternalDedalADL.g:2085:1: ( (lv_configConnections_46_0= ruleClassConnection ) )
                    	    // InternalDedalADL.g:2086:1: (lv_configConnections_46_0= ruleClassConnection )
                    	    {
                    	    // InternalDedalADL.g:2086:1: (lv_configConnections_46_0= ruleClassConnection )
                    	    // InternalDedalADL.g:2087:3: lv_configConnections_46_0= ruleClassConnection
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConfigurationAccess().getConfigConnectionsClassConnectionParserRuleCall_10_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_configConnections_46_0=ruleClassConnection();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConfigurationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"configConnections",
                    	            		lv_configConnections_46_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.ClassConnection");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    otherlv_47=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_47, grammarAccess.getConfigurationAccess().getRightParenthesisKeyword_10_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConfiguration"


    // $ANTLR start "entryRuleconfiguration_name"
    // InternalDedalADL.g:2115:1: entryRuleconfiguration_name returns [String current=null] : iv_ruleconfiguration_name= ruleconfiguration_name EOF ;
    public final String entryRuleconfiguration_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconfiguration_name = null;


        try {
            // InternalDedalADL.g:2116:2: (iv_ruleconfiguration_name= ruleconfiguration_name EOF )
            // InternalDedalADL.g:2117:2: iv_ruleconfiguration_name= ruleconfiguration_name EOF
            {
             newCompositeNode(grammarAccess.getConfiguration_nameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleconfiguration_name=ruleconfiguration_name();

            state._fsp--;

             current =iv_ruleconfiguration_name.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconfiguration_name"


    // $ANTLR start "ruleconfiguration_name"
    // InternalDedalADL.g:2124:1: ruleconfiguration_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleconfiguration_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:2127:28: (this_ID_0= RULE_ID )
            // InternalDedalADL.g:2128:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getConfiguration_nameAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconfiguration_name"


    // $ANTLR start "entryRulecomponent_class_name"
    // InternalDedalADL.g:2143:1: entryRulecomponent_class_name returns [String current=null] : iv_rulecomponent_class_name= rulecomponent_class_name EOF ;
    public final String entryRulecomponent_class_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecomponent_class_name = null;


        try {
            // InternalDedalADL.g:2144:2: (iv_rulecomponent_class_name= rulecomponent_class_name EOF )
            // InternalDedalADL.g:2145:2: iv_rulecomponent_class_name= rulecomponent_class_name EOF
            {
             newCompositeNode(grammarAccess.getComponent_class_nameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulecomponent_class_name=rulecomponent_class_name();

            state._fsp--;

             current =iv_rulecomponent_class_name.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecomponent_class_name"


    // $ANTLR start "rulecomponent_class_name"
    // InternalDedalADL.g:2152:1: rulecomponent_class_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken rulecomponent_class_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:2155:28: (this_ID_0= RULE_ID )
            // InternalDedalADL.g:2156:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getComponent_class_nameAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecomponent_class_name"


    // $ANTLR start "entryRuleCompType"
    // InternalDedalADL.g:2171:1: entryRuleCompType returns [EObject current=null] : iv_ruleCompType= ruleCompType EOF ;
    public final EObject entryRuleCompType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompType = null;


        try {
            // InternalDedalADL.g:2172:2: (iv_ruleCompType= ruleCompType EOF )
            // InternalDedalADL.g:2173:2: iv_ruleCompType= ruleCompType EOF
            {
             newCompositeNode(grammarAccess.getCompTypeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompType=ruleCompType();

            state._fsp--;

             current =iv_ruleCompType; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompType"


    // $ANTLR start "ruleCompType"
    // InternalDedalADL.g:2180:1: ruleCompType returns [EObject current=null] : (otherlv_0= 'component_type' ( (lv_name_1_0= rulecomponent_type_name ) ) otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) (otherlv_4= 'required_interfaces' ( (lv_compInterfaces_5_0= ruleInterface ) ) (otherlv_6= ';' ( (lv_compInterfaces_7_0= ruleInterface ) ) )* )? (otherlv_8= 'provided_interfaces' ( (lv_compInterfaces_9_0= ruleInterface ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInterface ) ) )* )? (otherlv_12= 'interactions' ( (lv_compInterfaces_13_0= ruleInteraction ) ) (otherlv_14= ';' ( (lv_compInterfaces_15_0= ruleInteraction ) ) )* )? ) ;
    public final EObject ruleCompType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_compInterfaces_5_0 = null;

        EObject lv_compInterfaces_7_0 = null;

        EObject lv_compInterfaces_9_0 = null;

        EObject lv_compInterfaces_11_0 = null;

        EObject lv_compInterfaces_13_0 = null;

        EObject lv_compInterfaces_15_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:2183:28: ( (otherlv_0= 'component_type' ( (lv_name_1_0= rulecomponent_type_name ) ) otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) (otherlv_4= 'required_interfaces' ( (lv_compInterfaces_5_0= ruleInterface ) ) (otherlv_6= ';' ( (lv_compInterfaces_7_0= ruleInterface ) ) )* )? (otherlv_8= 'provided_interfaces' ( (lv_compInterfaces_9_0= ruleInterface ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInterface ) ) )* )? (otherlv_12= 'interactions' ( (lv_compInterfaces_13_0= ruleInteraction ) ) (otherlv_14= ';' ( (lv_compInterfaces_15_0= ruleInteraction ) ) )* )? ) )
            // InternalDedalADL.g:2184:1: (otherlv_0= 'component_type' ( (lv_name_1_0= rulecomponent_type_name ) ) otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) (otherlv_4= 'required_interfaces' ( (lv_compInterfaces_5_0= ruleInterface ) ) (otherlv_6= ';' ( (lv_compInterfaces_7_0= ruleInterface ) ) )* )? (otherlv_8= 'provided_interfaces' ( (lv_compInterfaces_9_0= ruleInterface ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInterface ) ) )* )? (otherlv_12= 'interactions' ( (lv_compInterfaces_13_0= ruleInteraction ) ) (otherlv_14= ';' ( (lv_compInterfaces_15_0= ruleInteraction ) ) )* )? )
            {
            // InternalDedalADL.g:2184:1: (otherlv_0= 'component_type' ( (lv_name_1_0= rulecomponent_type_name ) ) otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) (otherlv_4= 'required_interfaces' ( (lv_compInterfaces_5_0= ruleInterface ) ) (otherlv_6= ';' ( (lv_compInterfaces_7_0= ruleInterface ) ) )* )? (otherlv_8= 'provided_interfaces' ( (lv_compInterfaces_9_0= ruleInterface ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInterface ) ) )* )? (otherlv_12= 'interactions' ( (lv_compInterfaces_13_0= ruleInteraction ) ) (otherlv_14= ';' ( (lv_compInterfaces_15_0= ruleInteraction ) ) )* )? )
            // InternalDedalADL.g:2184:3: otherlv_0= 'component_type' ( (lv_name_1_0= rulecomponent_type_name ) ) otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) (otherlv_4= 'required_interfaces' ( (lv_compInterfaces_5_0= ruleInterface ) ) (otherlv_6= ';' ( (lv_compInterfaces_7_0= ruleInterface ) ) )* )? (otherlv_8= 'provided_interfaces' ( (lv_compInterfaces_9_0= ruleInterface ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInterface ) ) )* )? (otherlv_12= 'interactions' ( (lv_compInterfaces_13_0= ruleInteraction ) ) (otherlv_14= ';' ( (lv_compInterfaces_15_0= ruleInteraction ) ) )* )?
            {
            otherlv_0=(Token)match(input,56,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_0, grammarAccess.getCompTypeAccess().getComponent_typeKeyword_0());
                
            // InternalDedalADL.g:2188:1: ( (lv_name_1_0= rulecomponent_type_name ) )
            // InternalDedalADL.g:2189:1: (lv_name_1_0= rulecomponent_type_name )
            {
            // InternalDedalADL.g:2189:1: (lv_name_1_0= rulecomponent_type_name )
            // InternalDedalADL.g:2190:3: lv_name_1_0= rulecomponent_type_name
            {
             
            	        newCompositeNode(grammarAccess.getCompTypeAccess().getNameComponent_type_nameParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_34);
            lv_name_1_0=rulecomponent_type_name();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompTypeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.component_type_name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getCompTypeAccess().getIdKeyword_2());
                
            // InternalDedalADL.g:2210:1: ( (lv_id_3_0= ruleEString ) )
            // InternalDedalADL.g:2211:1: (lv_id_3_0= ruleEString )
            {
            // InternalDedalADL.g:2211:1: (lv_id_3_0= ruleEString )
            // InternalDedalADL.g:2212:3: lv_id_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCompTypeAccess().getIdEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_66);
            lv_id_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompTypeRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_3_0, 
                    		"fr.ema.dedal.xtext.DedalADL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:2228:2: (otherlv_4= 'required_interfaces' ( (lv_compInterfaces_5_0= ruleInterface ) ) (otherlv_6= ';' ( (lv_compInterfaces_7_0= ruleInterface ) ) )* )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==35) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalDedalADL.g:2228:4: otherlv_4= 'required_interfaces' ( (lv_compInterfaces_5_0= ruleInterface ) ) (otherlv_6= ';' ( (lv_compInterfaces_7_0= ruleInterface ) ) )*
                    {
                    otherlv_4=(Token)match(input,35,FollowSets000.FOLLOW_36); 

                        	newLeafNode(otherlv_4, grammarAccess.getCompTypeAccess().getRequired_interfacesKeyword_4_0());
                        
                    // InternalDedalADL.g:2232:1: ( (lv_compInterfaces_5_0= ruleInterface ) )
                    // InternalDedalADL.g:2233:1: (lv_compInterfaces_5_0= ruleInterface )
                    {
                    // InternalDedalADL.g:2233:1: (lv_compInterfaces_5_0= ruleInterface )
                    // InternalDedalADL.g:2234:3: lv_compInterfaces_5_0= ruleInterface
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompTypeAccess().getCompInterfacesInterfaceParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_67);
                    lv_compInterfaces_5_0=ruleInterface();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"compInterfaces",
                            		lv_compInterfaces_5_0, 
                            		"fr.ema.dedal.xtext.DedalADL.Interface");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:2250:2: (otherlv_6= ';' ( (lv_compInterfaces_7_0= ruleInterface ) ) )*
                    loop56:
                    do {
                        int alt56=2;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==15) ) {
                            int LA56_2 = input.LA(2);

                            if ( (LA56_2==40) ) {
                                alt56=1;
                            }


                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalDedalADL.g:2250:4: otherlv_6= ';' ( (lv_compInterfaces_7_0= ruleInterface ) )
                    	    {
                    	    otherlv_6=(Token)match(input,15,FollowSets000.FOLLOW_36); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getCompTypeAccess().getSemicolonKeyword_4_2_0());
                    	        
                    	    // InternalDedalADL.g:2254:1: ( (lv_compInterfaces_7_0= ruleInterface ) )
                    	    // InternalDedalADL.g:2255:1: (lv_compInterfaces_7_0= ruleInterface )
                    	    {
                    	    // InternalDedalADL.g:2255:1: (lv_compInterfaces_7_0= ruleInterface )
                    	    // InternalDedalADL.g:2256:3: lv_compInterfaces_7_0= ruleInterface
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCompTypeAccess().getCompInterfacesInterfaceParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_67);
                    	    lv_compInterfaces_7_0=ruleInterface();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCompTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"compInterfaces",
                    	            		lv_compInterfaces_7_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.Interface");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDedalADL.g:2272:6: (otherlv_8= 'provided_interfaces' ( (lv_compInterfaces_9_0= ruleInterface ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInterface ) ) )* )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==36) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalDedalADL.g:2272:8: otherlv_8= 'provided_interfaces' ( (lv_compInterfaces_9_0= ruleInterface ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInterface ) ) )*
                    {
                    otherlv_8=(Token)match(input,36,FollowSets000.FOLLOW_36); 

                        	newLeafNode(otherlv_8, grammarAccess.getCompTypeAccess().getProvided_interfacesKeyword_5_0());
                        
                    // InternalDedalADL.g:2276:1: ( (lv_compInterfaces_9_0= ruleInterface ) )
                    // InternalDedalADL.g:2277:1: (lv_compInterfaces_9_0= ruleInterface )
                    {
                    // InternalDedalADL.g:2277:1: (lv_compInterfaces_9_0= ruleInterface )
                    // InternalDedalADL.g:2278:3: lv_compInterfaces_9_0= ruleInterface
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompTypeAccess().getCompInterfacesInterfaceParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_68);
                    lv_compInterfaces_9_0=ruleInterface();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"compInterfaces",
                            		lv_compInterfaces_9_0, 
                            		"fr.ema.dedal.xtext.DedalADL.Interface");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:2294:2: (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInterface ) ) )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==15) ) {
                            int LA58_2 = input.LA(2);

                            if ( (LA58_2==40) ) {
                                alt58=1;
                            }


                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalDedalADL.g:2294:4: otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInterface ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_36); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getCompTypeAccess().getSemicolonKeyword_5_2_0());
                    	        
                    	    // InternalDedalADL.g:2298:1: ( (lv_compInterfaces_11_0= ruleInterface ) )
                    	    // InternalDedalADL.g:2299:1: (lv_compInterfaces_11_0= ruleInterface )
                    	    {
                    	    // InternalDedalADL.g:2299:1: (lv_compInterfaces_11_0= ruleInterface )
                    	    // InternalDedalADL.g:2300:3: lv_compInterfaces_11_0= ruleInterface
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCompTypeAccess().getCompInterfacesInterfaceParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_68);
                    	    lv_compInterfaces_11_0=ruleInterface();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCompTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"compInterfaces",
                    	            		lv_compInterfaces_11_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.Interface");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDedalADL.g:2316:6: (otherlv_12= 'interactions' ( (lv_compInterfaces_13_0= ruleInteraction ) ) (otherlv_14= ';' ( (lv_compInterfaces_15_0= ruleInteraction ) ) )* )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==39) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalDedalADL.g:2316:8: otherlv_12= 'interactions' ( (lv_compInterfaces_13_0= ruleInteraction ) ) (otherlv_14= ';' ( (lv_compInterfaces_15_0= ruleInteraction ) ) )*
                    {
                    otherlv_12=(Token)match(input,39,FollowSets000.FOLLOW_42); 

                        	newLeafNode(otherlv_12, grammarAccess.getCompTypeAccess().getInteractionsKeyword_6_0());
                        
                    // InternalDedalADL.g:2320:1: ( (lv_compInterfaces_13_0= ruleInteraction ) )
                    // InternalDedalADL.g:2321:1: (lv_compInterfaces_13_0= ruleInteraction )
                    {
                    // InternalDedalADL.g:2321:1: (lv_compInterfaces_13_0= ruleInteraction )
                    // InternalDedalADL.g:2322:3: lv_compInterfaces_13_0= ruleInteraction
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompTypeAccess().getCompInterfacesInteractionParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_33);
                    lv_compInterfaces_13_0=ruleInteraction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompTypeRule());
                    	        }
                           		add(
                           			current, 
                           			"compInterfaces",
                            		lv_compInterfaces_13_0, 
                            		"fr.ema.dedal.xtext.DedalADL.Interaction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:2338:2: (otherlv_14= ';' ( (lv_compInterfaces_15_0= ruleInteraction ) ) )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==15) ) {
                            int LA60_2 = input.LA(2);

                            if ( (LA60_2==40||LA60_2==73||LA60_2==75) ) {
                                alt60=1;
                            }


                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalDedalADL.g:2338:4: otherlv_14= ';' ( (lv_compInterfaces_15_0= ruleInteraction ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FollowSets000.FOLLOW_42); 

                    	        	newLeafNode(otherlv_14, grammarAccess.getCompTypeAccess().getSemicolonKeyword_6_2_0());
                    	        
                    	    // InternalDedalADL.g:2342:1: ( (lv_compInterfaces_15_0= ruleInteraction ) )
                    	    // InternalDedalADL.g:2343:1: (lv_compInterfaces_15_0= ruleInteraction )
                    	    {
                    	    // InternalDedalADL.g:2343:1: (lv_compInterfaces_15_0= ruleInteraction )
                    	    // InternalDedalADL.g:2344:3: lv_compInterfaces_15_0= ruleInteraction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCompTypeAccess().getCompInterfacesInteractionParserRuleCall_6_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_33);
                    	    lv_compInterfaces_15_0=ruleInteraction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCompTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"compInterfaces",
                    	            		lv_compInterfaces_15_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.Interaction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop60;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompType"


    // $ANTLR start "entryRulecomponent_type_name"
    // InternalDedalADL.g:2368:1: entryRulecomponent_type_name returns [String current=null] : iv_rulecomponent_type_name= rulecomponent_type_name EOF ;
    public final String entryRulecomponent_type_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecomponent_type_name = null;


        try {
            // InternalDedalADL.g:2369:2: (iv_rulecomponent_type_name= rulecomponent_type_name EOF )
            // InternalDedalADL.g:2370:2: iv_rulecomponent_type_name= rulecomponent_type_name EOF
            {
             newCompositeNode(grammarAccess.getComponent_type_nameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulecomponent_type_name=rulecomponent_type_name();

            state._fsp--;

             current =iv_rulecomponent_type_name.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecomponent_type_name"


    // $ANTLR start "rulecomponent_type_name"
    // InternalDedalADL.g:2377:1: rulecomponent_type_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken rulecomponent_type_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:2380:28: (this_ID_0= RULE_ID )
            // InternalDedalADL.g:2381:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getComponent_type_nameAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecomponent_type_name"


    // $ANTLR start "entryRuleCompClass_Impl"
    // InternalDedalADL.g:2396:1: entryRuleCompClass_Impl returns [EObject current=null] : iv_ruleCompClass_Impl= ruleCompClass_Impl EOF ;
    public final EObject entryRuleCompClass_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompClass_Impl = null;


        try {
            // InternalDedalADL.g:2397:2: (iv_ruleCompClass_Impl= ruleCompClass_Impl EOF )
            // InternalDedalADL.g:2398:2: iv_ruleCompClass_Impl= ruleCompClass_Impl EOF
            {
             newCompositeNode(grammarAccess.getCompClass_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompClass_Impl=ruleCompClass_Impl();

            state._fsp--;

             current =iv_ruleCompClass_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompClass_Impl"


    // $ANTLR start "ruleCompClass_Impl"
    // InternalDedalADL.g:2405:1: ruleCompClass_Impl returns [EObject current=null] : (otherlv_0= 'primitive_component_class' ( (lv_name_1_0= rulecomponent_class_name ) ) (otherlv_2= 'as' ( ( ruleEString ) ) (otherlv_4= ';' ( ( ruleEString ) ) )* )? otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) otherlv_8= 'implements' ( ( ruleEString ) ) (otherlv_10= 'content' ( ( ruleEString ) ) )? (otherlv_12= 'attributes' otherlv_13= '(' ( (lv_attributes_14_0= ruleAttribute ) ) (otherlv_15= ';' ( (lv_attributes_16_0= ruleAttribute ) ) )* otherlv_17= ')' )? (otherlv_18= 'versionID' this_REVISION_NUMB_19= RULE_REVISION_NUMB )? (otherlv_20= 'pre_version' this_REVISION_NUMB_21= RULE_REVISION_NUMB )? (otherlv_22= 'interfaces' ( (lv_compInterfaces_23_0= ruleInteraction ) ) (otherlv_24= ';' ( (lv_compInterfaces_25_0= ruleInteraction ) ) )* )? ) ;
    public final EObject ruleCompClass_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token this_REVISION_NUMB_19=null;
        Token otherlv_20=null;
        Token this_REVISION_NUMB_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_id_7_0 = null;

        EObject lv_attributes_14_0 = null;

        EObject lv_attributes_16_0 = null;

        EObject lv_compInterfaces_23_0 = null;

        EObject lv_compInterfaces_25_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:2408:28: ( (otherlv_0= 'primitive_component_class' ( (lv_name_1_0= rulecomponent_class_name ) ) (otherlv_2= 'as' ( ( ruleEString ) ) (otherlv_4= ';' ( ( ruleEString ) ) )* )? otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) otherlv_8= 'implements' ( ( ruleEString ) ) (otherlv_10= 'content' ( ( ruleEString ) ) )? (otherlv_12= 'attributes' otherlv_13= '(' ( (lv_attributes_14_0= ruleAttribute ) ) (otherlv_15= ';' ( (lv_attributes_16_0= ruleAttribute ) ) )* otherlv_17= ')' )? (otherlv_18= 'versionID' this_REVISION_NUMB_19= RULE_REVISION_NUMB )? (otherlv_20= 'pre_version' this_REVISION_NUMB_21= RULE_REVISION_NUMB )? (otherlv_22= 'interfaces' ( (lv_compInterfaces_23_0= ruleInteraction ) ) (otherlv_24= ';' ( (lv_compInterfaces_25_0= ruleInteraction ) ) )* )? ) )
            // InternalDedalADL.g:2409:1: (otherlv_0= 'primitive_component_class' ( (lv_name_1_0= rulecomponent_class_name ) ) (otherlv_2= 'as' ( ( ruleEString ) ) (otherlv_4= ';' ( ( ruleEString ) ) )* )? otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) otherlv_8= 'implements' ( ( ruleEString ) ) (otherlv_10= 'content' ( ( ruleEString ) ) )? (otherlv_12= 'attributes' otherlv_13= '(' ( (lv_attributes_14_0= ruleAttribute ) ) (otherlv_15= ';' ( (lv_attributes_16_0= ruleAttribute ) ) )* otherlv_17= ')' )? (otherlv_18= 'versionID' this_REVISION_NUMB_19= RULE_REVISION_NUMB )? (otherlv_20= 'pre_version' this_REVISION_NUMB_21= RULE_REVISION_NUMB )? (otherlv_22= 'interfaces' ( (lv_compInterfaces_23_0= ruleInteraction ) ) (otherlv_24= ';' ( (lv_compInterfaces_25_0= ruleInteraction ) ) )* )? )
            {
            // InternalDedalADL.g:2409:1: (otherlv_0= 'primitive_component_class' ( (lv_name_1_0= rulecomponent_class_name ) ) (otherlv_2= 'as' ( ( ruleEString ) ) (otherlv_4= ';' ( ( ruleEString ) ) )* )? otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) otherlv_8= 'implements' ( ( ruleEString ) ) (otherlv_10= 'content' ( ( ruleEString ) ) )? (otherlv_12= 'attributes' otherlv_13= '(' ( (lv_attributes_14_0= ruleAttribute ) ) (otherlv_15= ';' ( (lv_attributes_16_0= ruleAttribute ) ) )* otherlv_17= ')' )? (otherlv_18= 'versionID' this_REVISION_NUMB_19= RULE_REVISION_NUMB )? (otherlv_20= 'pre_version' this_REVISION_NUMB_21= RULE_REVISION_NUMB )? (otherlv_22= 'interfaces' ( (lv_compInterfaces_23_0= ruleInteraction ) ) (otherlv_24= ';' ( (lv_compInterfaces_25_0= ruleInteraction ) ) )* )? )
            // InternalDedalADL.g:2409:3: otherlv_0= 'primitive_component_class' ( (lv_name_1_0= rulecomponent_class_name ) ) (otherlv_2= 'as' ( ( ruleEString ) ) (otherlv_4= ';' ( ( ruleEString ) ) )* )? otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) otherlv_8= 'implements' ( ( ruleEString ) ) (otherlv_10= 'content' ( ( ruleEString ) ) )? (otherlv_12= 'attributes' otherlv_13= '(' ( (lv_attributes_14_0= ruleAttribute ) ) (otherlv_15= ';' ( (lv_attributes_16_0= ruleAttribute ) ) )* otherlv_17= ')' )? (otherlv_18= 'versionID' this_REVISION_NUMB_19= RULE_REVISION_NUMB )? (otherlv_20= 'pre_version' this_REVISION_NUMB_21= RULE_REVISION_NUMB )? (otherlv_22= 'interfaces' ( (lv_compInterfaces_23_0= ruleInteraction ) ) (otherlv_24= ';' ( (lv_compInterfaces_25_0= ruleInteraction ) ) )* )?
            {
            otherlv_0=(Token)match(input,57,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_0, grammarAccess.getCompClass_ImplAccess().getPrimitive_component_classKeyword_0());
                
            // InternalDedalADL.g:2413:1: ( (lv_name_1_0= rulecomponent_class_name ) )
            // InternalDedalADL.g:2414:1: (lv_name_1_0= rulecomponent_class_name )
            {
            // InternalDedalADL.g:2414:1: (lv_name_1_0= rulecomponent_class_name )
            // InternalDedalADL.g:2415:3: lv_name_1_0= rulecomponent_class_name
            {
             
            	        newCompositeNode(grammarAccess.getCompClass_ImplAccess().getNameComponent_class_nameParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_69);
            lv_name_1_0=rulecomponent_class_name();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompClass_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.component_class_name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:2431:2: (otherlv_2= 'as' ( ( ruleEString ) ) (otherlv_4= ';' ( ( ruleEString ) ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==53) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalDedalADL.g:2431:4: otherlv_2= 'as' ( ( ruleEString ) ) (otherlv_4= ';' ( ( ruleEString ) ) )*
                    {
                    otherlv_2=(Token)match(input,53,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getCompClass_ImplAccess().getAsKeyword_2_0());
                        
                    // InternalDedalADL.g:2435:1: ( ( ruleEString ) )
                    // InternalDedalADL.g:2436:1: ( ruleEString )
                    {
                    // InternalDedalADL.g:2436:1: ( ruleEString )
                    // InternalDedalADL.g:2437:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCompClass_ImplRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCompClass_ImplAccess().getRealizesCompRoleCrossReference_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_70);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:2450:2: (otherlv_4= ';' ( ( ruleEString ) ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==15) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalDedalADL.g:2450:4: otherlv_4= ';' ( ( ruleEString ) )
                    	    {
                    	    otherlv_4=(Token)match(input,15,FollowSets000.FOLLOW_3); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getCompClass_ImplAccess().getSemicolonKeyword_2_2_0());
                    	        
                    	    // InternalDedalADL.g:2454:1: ( ( ruleEString ) )
                    	    // InternalDedalADL.g:2455:1: ( ruleEString )
                    	    {
                    	    // InternalDedalADL.g:2455:1: ( ruleEString )
                    	    // InternalDedalADL.g:2456:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getCompClass_ImplRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getCompClass_ImplAccess().getRealizesCompRoleCrossReference_2_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_70);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_6, grammarAccess.getCompClass_ImplAccess().getIdKeyword_3());
                
            // InternalDedalADL.g:2473:1: ( (lv_id_7_0= ruleEString ) )
            // InternalDedalADL.g:2474:1: (lv_id_7_0= ruleEString )
            {
            // InternalDedalADL.g:2474:1: (lv_id_7_0= ruleEString )
            // InternalDedalADL.g:2475:3: lv_id_7_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCompClass_ImplAccess().getIdEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_71);
            lv_id_7_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompClass_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_7_0, 
                    		"fr.ema.dedal.xtext.DedalADL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,50,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_8, grammarAccess.getCompClass_ImplAccess().getImplementsKeyword_5());
                
            // InternalDedalADL.g:2495:1: ( ( ruleEString ) )
            // InternalDedalADL.g:2496:1: ( ruleEString )
            {
            // InternalDedalADL.g:2496:1: ( ruleEString )
            // InternalDedalADL.g:2497:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCompClass_ImplRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCompClass_ImplAccess().getImplementsCompTypeCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_72);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:2510:2: (otherlv_10= 'content' ( ( ruleEString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==58) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalDedalADL.g:2510:4: otherlv_10= 'content' ( ( ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,58,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_10, grammarAccess.getCompClass_ImplAccess().getContentKeyword_7_0());
                        
                    // InternalDedalADL.g:2514:1: ( ( ruleEString ) )
                    // InternalDedalADL.g:2515:1: ( ruleEString )
                    {
                    // InternalDedalADL.g:2515:1: ( ruleEString )
                    // InternalDedalADL.g:2516:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCompClass_ImplRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCompClass_ImplAccess().getContentCompInstanceCrossReference_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_73);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // InternalDedalADL.g:2529:4: (otherlv_12= 'attributes' otherlv_13= '(' ( (lv_attributes_14_0= ruleAttribute ) ) (otherlv_15= ';' ( (lv_attributes_16_0= ruleAttribute ) ) )* otherlv_17= ')' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==59) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalDedalADL.g:2529:6: otherlv_12= 'attributes' otherlv_13= '(' ( (lv_attributes_14_0= ruleAttribute ) ) (otherlv_15= ';' ( (lv_attributes_16_0= ruleAttribute ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,59,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_12, grammarAccess.getCompClass_ImplAccess().getAttributesKeyword_8_0());
                        
                    otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_13, grammarAccess.getCompClass_ImplAccess().getLeftParenthesisKeyword_8_1());
                        
                    // InternalDedalADL.g:2537:1: ( (lv_attributes_14_0= ruleAttribute ) )
                    // InternalDedalADL.g:2538:1: (lv_attributes_14_0= ruleAttribute )
                    {
                    // InternalDedalADL.g:2538:1: (lv_attributes_14_0= ruleAttribute )
                    // InternalDedalADL.g:2539:3: lv_attributes_14_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompClass_ImplAccess().getAttributesAttributeParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_attributes_14_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompClass_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_14_0, 
                            		"fr.ema.dedal.xtext.DedalADL.Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:2555:2: (otherlv_15= ';' ( (lv_attributes_16_0= ruleAttribute ) ) )*
                    loop65:
                    do {
                        int alt65=2;
                        int LA65_0 = input.LA(1);

                        if ( (LA65_0==15) ) {
                            alt65=1;
                        }


                        switch (alt65) {
                    	case 1 :
                    	    // InternalDedalADL.g:2555:4: otherlv_15= ';' ( (lv_attributes_16_0= ruleAttribute ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FollowSets000.FOLLOW_3); 

                    	        	newLeafNode(otherlv_15, grammarAccess.getCompClass_ImplAccess().getSemicolonKeyword_8_3_0());
                    	        
                    	    // InternalDedalADL.g:2559:1: ( (lv_attributes_16_0= ruleAttribute ) )
                    	    // InternalDedalADL.g:2560:1: (lv_attributes_16_0= ruleAttribute )
                    	    {
                    	    // InternalDedalADL.g:2560:1: (lv_attributes_16_0= ruleAttribute )
                    	    // InternalDedalADL.g:2561:3: lv_attributes_16_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCompClass_ImplAccess().getAttributesAttributeParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_attributes_16_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCompClass_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_16_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop65;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,16,FollowSets000.FOLLOW_74); 

                        	newLeafNode(otherlv_17, grammarAccess.getCompClass_ImplAccess().getRightParenthesisKeyword_8_4());
                        

                    }
                    break;

            }

            // InternalDedalADL.g:2581:3: (otherlv_18= 'versionID' this_REVISION_NUMB_19= RULE_REVISION_NUMB )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==30) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalDedalADL.g:2581:5: otherlv_18= 'versionID' this_REVISION_NUMB_19= RULE_REVISION_NUMB
                    {
                    otherlv_18=(Token)match(input,30,FollowSets000.FOLLOW_28); 

                        	newLeafNode(otherlv_18, grammarAccess.getCompClass_ImplAccess().getVersionIDKeyword_9_0());
                        
                    this_REVISION_NUMB_19=(Token)match(input,RULE_REVISION_NUMB,FollowSets000.FOLLOW_75); 
                     
                        newLeafNode(this_REVISION_NUMB_19, grammarAccess.getCompClass_ImplAccess().getREVISION_NUMBTerminalRuleCall_9_1()); 
                        

                    }
                    break;

            }

            // InternalDedalADL.g:2589:3: (otherlv_20= 'pre_version' this_REVISION_NUMB_21= RULE_REVISION_NUMB )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==31) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalDedalADL.g:2589:5: otherlv_20= 'pre_version' this_REVISION_NUMB_21= RULE_REVISION_NUMB
                    {
                    otherlv_20=(Token)match(input,31,FollowSets000.FOLLOW_28); 

                        	newLeafNode(otherlv_20, grammarAccess.getCompClass_ImplAccess().getPre_versionKeyword_10_0());
                        
                    this_REVISION_NUMB_21=(Token)match(input,RULE_REVISION_NUMB,FollowSets000.FOLLOW_76); 
                     
                        newLeafNode(this_REVISION_NUMB_21, grammarAccess.getCompClass_ImplAccess().getREVISION_NUMBTerminalRuleCall_10_1()); 
                        

                    }
                    break;

            }

            // InternalDedalADL.g:2597:3: (otherlv_22= 'interfaces' ( (lv_compInterfaces_23_0= ruleInteraction ) ) (otherlv_24= ';' ( (lv_compInterfaces_25_0= ruleInteraction ) ) )* )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==60) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalDedalADL.g:2597:5: otherlv_22= 'interfaces' ( (lv_compInterfaces_23_0= ruleInteraction ) ) (otherlv_24= ';' ( (lv_compInterfaces_25_0= ruleInteraction ) ) )*
                    {
                    otherlv_22=(Token)match(input,60,FollowSets000.FOLLOW_42); 

                        	newLeafNode(otherlv_22, grammarAccess.getCompClass_ImplAccess().getInterfacesKeyword_11_0());
                        
                    // InternalDedalADL.g:2601:1: ( (lv_compInterfaces_23_0= ruleInteraction ) )
                    // InternalDedalADL.g:2602:1: (lv_compInterfaces_23_0= ruleInteraction )
                    {
                    // InternalDedalADL.g:2602:1: (lv_compInterfaces_23_0= ruleInteraction )
                    // InternalDedalADL.g:2603:3: lv_compInterfaces_23_0= ruleInteraction
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompClass_ImplAccess().getCompInterfacesInteractionParserRuleCall_11_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_33);
                    lv_compInterfaces_23_0=ruleInteraction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompClass_ImplRule());
                    	        }
                           		add(
                           			current, 
                           			"compInterfaces",
                            		lv_compInterfaces_23_0, 
                            		"fr.ema.dedal.xtext.DedalADL.Interaction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:2619:2: (otherlv_24= ';' ( (lv_compInterfaces_25_0= ruleInteraction ) ) )*
                    loop69:
                    do {
                        int alt69=2;
                        int LA69_0 = input.LA(1);

                        if ( (LA69_0==15) ) {
                            int LA69_2 = input.LA(2);

                            if ( (LA69_2==40||LA69_2==73||LA69_2==75) ) {
                                alt69=1;
                            }


                        }


                        switch (alt69) {
                    	case 1 :
                    	    // InternalDedalADL.g:2619:4: otherlv_24= ';' ( (lv_compInterfaces_25_0= ruleInteraction ) )
                    	    {
                    	    otherlv_24=(Token)match(input,15,FollowSets000.FOLLOW_42); 

                    	        	newLeafNode(otherlv_24, grammarAccess.getCompClass_ImplAccess().getSemicolonKeyword_11_2_0());
                    	        
                    	    // InternalDedalADL.g:2623:1: ( (lv_compInterfaces_25_0= ruleInteraction ) )
                    	    // InternalDedalADL.g:2624:1: (lv_compInterfaces_25_0= ruleInteraction )
                    	    {
                    	    // InternalDedalADL.g:2624:1: (lv_compInterfaces_25_0= ruleInteraction )
                    	    // InternalDedalADL.g:2625:3: lv_compInterfaces_25_0= ruleInteraction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCompClass_ImplAccess().getCompInterfacesInteractionParserRuleCall_11_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_33);
                    	    lv_compInterfaces_25_0=ruleInteraction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCompClass_ImplRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"compInterfaces",
                    	            		lv_compInterfaces_25_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.Interaction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop69;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompClass_Impl"


    // $ANTLR start "entryRuleAttribute"
    // InternalDedalADL.g:2649:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalDedalADL.g:2650:2: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalDedalADL.g:2651:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalDedalADL.g:2658:1: ruleAttribute returns [EObject current=null] : ( ( (lv_type_0_0= ruleEString ) ) ( (lv_name_1_0= ruleattribute_name ) ) ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_type_0_0 = null;

        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:2661:28: ( ( ( (lv_type_0_0= ruleEString ) ) ( (lv_name_1_0= ruleattribute_name ) ) ) )
            // InternalDedalADL.g:2662:1: ( ( (lv_type_0_0= ruleEString ) ) ( (lv_name_1_0= ruleattribute_name ) ) )
            {
            // InternalDedalADL.g:2662:1: ( ( (lv_type_0_0= ruleEString ) ) ( (lv_name_1_0= ruleattribute_name ) ) )
            // InternalDedalADL.g:2662:2: ( (lv_type_0_0= ruleEString ) ) ( (lv_name_1_0= ruleattribute_name ) )
            {
            // InternalDedalADL.g:2662:2: ( (lv_type_0_0= ruleEString ) )
            // InternalDedalADL.g:2663:1: (lv_type_0_0= ruleEString )
            {
            // InternalDedalADL.g:2663:1: (lv_type_0_0= ruleEString )
            // InternalDedalADL.g:2664:3: lv_type_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getTypeEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_22);
            lv_type_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_0_0, 
                    		"fr.ema.dedal.xtext.DedalADL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:2680:2: ( (lv_name_1_0= ruleattribute_name ) )
            // InternalDedalADL.g:2681:1: (lv_name_1_0= ruleattribute_name )
            {
            // InternalDedalADL.g:2681:1: (lv_name_1_0= ruleattribute_name )
            // InternalDedalADL.g:2682:3: lv_name_1_0= ruleattribute_name
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getNameAttribute_nameParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            lv_name_1_0=ruleattribute_name();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.attribute_name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleattribute_name"
    // InternalDedalADL.g:2706:1: entryRuleattribute_name returns [String current=null] : iv_ruleattribute_name= ruleattribute_name EOF ;
    public final String entryRuleattribute_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleattribute_name = null;


        try {
            // InternalDedalADL.g:2707:2: (iv_ruleattribute_name= ruleattribute_name EOF )
            // InternalDedalADL.g:2708:2: iv_ruleattribute_name= ruleattribute_name EOF
            {
             newCompositeNode(grammarAccess.getAttribute_nameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleattribute_name=ruleattribute_name();

            state._fsp--;

             current =iv_ruleattribute_name.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleattribute_name"


    // $ANTLR start "ruleattribute_name"
    // InternalDedalADL.g:2715:1: ruleattribute_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleattribute_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:2718:28: (this_ID_0= RULE_ID )
            // InternalDedalADL.g:2719:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getAttribute_nameAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleattribute_name"


    // $ANTLR start "entryRuleCompositeCompClass"
    // InternalDedalADL.g:2734:1: entryRuleCompositeCompClass returns [EObject current=null] : iv_ruleCompositeCompClass= ruleCompositeCompClass EOF ;
    public final EObject entryRuleCompositeCompClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeCompClass = null;


        try {
            // InternalDedalADL.g:2735:2: (iv_ruleCompositeCompClass= ruleCompositeCompClass EOF )
            // InternalDedalADL.g:2736:2: iv_ruleCompositeCompClass= ruleCompositeCompClass EOF
            {
             newCompositeNode(grammarAccess.getCompositeCompClassRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompositeCompClass=ruleCompositeCompClass();

            state._fsp--;

             current =iv_ruleCompositeCompClass; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeCompClass"


    // $ANTLR start "ruleCompositeCompClass"
    // InternalDedalADL.g:2743:1: ruleCompositeCompClass returns [EObject current=null] : (otherlv_0= 'composite_component_class' ( (lv_name_1_0= rulecomponent_class_name ) ) otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= 'implements' ( ( ruleEString ) ) (otherlv_6= 'content' ( ( ruleEString ) ) (otherlv_8= '(' this_REVISION_NUMB_9= RULE_REVISION_NUMB otherlv_10= ')' )? )? (otherlv_11= 'delegated_interfaces' ruledelegated_interface_list )? (otherlv_13= 'attributes' otherlv_14= '(' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ';' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= ')' )? (otherlv_19= 'versionID' this_REVISION_NUMB_20= RULE_REVISION_NUMB )? (otherlv_21= 'pre_version' this_REVISION_NUMB_22= RULE_REVISION_NUMB )? (otherlv_23= 'realizes' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ';' ( ( ruleEString ) ) )* otherlv_28= ')' )? (otherlv_29= 'interfaces' ( (lv_compInterfaces_30_0= ruleInteraction ) ) (otherlv_31= ';' ( (lv_compInterfaces_32_0= ruleInteraction ) ) )* )? (otherlv_33= 'delegated_old' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ';' ( (otherlv_36= RULE_ID ) ) )* )? ) ;
    public final EObject ruleCompositeCompClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token this_REVISION_NUMB_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token this_REVISION_NUMB_20=null;
        Token otherlv_21=null;
        Token this_REVISION_NUMB_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_36=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_id_3_0 = null;

        EObject lv_attributes_15_0 = null;

        EObject lv_attributes_17_0 = null;

        EObject lv_compInterfaces_30_0 = null;

        EObject lv_compInterfaces_32_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:2746:28: ( (otherlv_0= 'composite_component_class' ( (lv_name_1_0= rulecomponent_class_name ) ) otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= 'implements' ( ( ruleEString ) ) (otherlv_6= 'content' ( ( ruleEString ) ) (otherlv_8= '(' this_REVISION_NUMB_9= RULE_REVISION_NUMB otherlv_10= ')' )? )? (otherlv_11= 'delegated_interfaces' ruledelegated_interface_list )? (otherlv_13= 'attributes' otherlv_14= '(' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ';' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= ')' )? (otherlv_19= 'versionID' this_REVISION_NUMB_20= RULE_REVISION_NUMB )? (otherlv_21= 'pre_version' this_REVISION_NUMB_22= RULE_REVISION_NUMB )? (otherlv_23= 'realizes' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ';' ( ( ruleEString ) ) )* otherlv_28= ')' )? (otherlv_29= 'interfaces' ( (lv_compInterfaces_30_0= ruleInteraction ) ) (otherlv_31= ';' ( (lv_compInterfaces_32_0= ruleInteraction ) ) )* )? (otherlv_33= 'delegated_old' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ';' ( (otherlv_36= RULE_ID ) ) )* )? ) )
            // InternalDedalADL.g:2747:1: (otherlv_0= 'composite_component_class' ( (lv_name_1_0= rulecomponent_class_name ) ) otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= 'implements' ( ( ruleEString ) ) (otherlv_6= 'content' ( ( ruleEString ) ) (otherlv_8= '(' this_REVISION_NUMB_9= RULE_REVISION_NUMB otherlv_10= ')' )? )? (otherlv_11= 'delegated_interfaces' ruledelegated_interface_list )? (otherlv_13= 'attributes' otherlv_14= '(' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ';' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= ')' )? (otherlv_19= 'versionID' this_REVISION_NUMB_20= RULE_REVISION_NUMB )? (otherlv_21= 'pre_version' this_REVISION_NUMB_22= RULE_REVISION_NUMB )? (otherlv_23= 'realizes' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ';' ( ( ruleEString ) ) )* otherlv_28= ')' )? (otherlv_29= 'interfaces' ( (lv_compInterfaces_30_0= ruleInteraction ) ) (otherlv_31= ';' ( (lv_compInterfaces_32_0= ruleInteraction ) ) )* )? (otherlv_33= 'delegated_old' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ';' ( (otherlv_36= RULE_ID ) ) )* )? )
            {
            // InternalDedalADL.g:2747:1: (otherlv_0= 'composite_component_class' ( (lv_name_1_0= rulecomponent_class_name ) ) otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= 'implements' ( ( ruleEString ) ) (otherlv_6= 'content' ( ( ruleEString ) ) (otherlv_8= '(' this_REVISION_NUMB_9= RULE_REVISION_NUMB otherlv_10= ')' )? )? (otherlv_11= 'delegated_interfaces' ruledelegated_interface_list )? (otherlv_13= 'attributes' otherlv_14= '(' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ';' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= ')' )? (otherlv_19= 'versionID' this_REVISION_NUMB_20= RULE_REVISION_NUMB )? (otherlv_21= 'pre_version' this_REVISION_NUMB_22= RULE_REVISION_NUMB )? (otherlv_23= 'realizes' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ';' ( ( ruleEString ) ) )* otherlv_28= ')' )? (otherlv_29= 'interfaces' ( (lv_compInterfaces_30_0= ruleInteraction ) ) (otherlv_31= ';' ( (lv_compInterfaces_32_0= ruleInteraction ) ) )* )? (otherlv_33= 'delegated_old' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ';' ( (otherlv_36= RULE_ID ) ) )* )? )
            // InternalDedalADL.g:2747:3: otherlv_0= 'composite_component_class' ( (lv_name_1_0= rulecomponent_class_name ) ) otherlv_2= 'id' ( (lv_id_3_0= ruleEString ) ) otherlv_4= 'implements' ( ( ruleEString ) ) (otherlv_6= 'content' ( ( ruleEString ) ) (otherlv_8= '(' this_REVISION_NUMB_9= RULE_REVISION_NUMB otherlv_10= ')' )? )? (otherlv_11= 'delegated_interfaces' ruledelegated_interface_list )? (otherlv_13= 'attributes' otherlv_14= '(' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ';' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= ')' )? (otherlv_19= 'versionID' this_REVISION_NUMB_20= RULE_REVISION_NUMB )? (otherlv_21= 'pre_version' this_REVISION_NUMB_22= RULE_REVISION_NUMB )? (otherlv_23= 'realizes' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ';' ( ( ruleEString ) ) )* otherlv_28= ')' )? (otherlv_29= 'interfaces' ( (lv_compInterfaces_30_0= ruleInteraction ) ) (otherlv_31= ';' ( (lv_compInterfaces_32_0= ruleInteraction ) ) )* )? (otherlv_33= 'delegated_old' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ';' ( (otherlv_36= RULE_ID ) ) )* )?
            {
            otherlv_0=(Token)match(input,61,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_0, grammarAccess.getCompositeCompClassAccess().getComposite_component_classKeyword_0());
                
            // InternalDedalADL.g:2751:1: ( (lv_name_1_0= rulecomponent_class_name ) )
            // InternalDedalADL.g:2752:1: (lv_name_1_0= rulecomponent_class_name )
            {
            // InternalDedalADL.g:2752:1: (lv_name_1_0= rulecomponent_class_name )
            // InternalDedalADL.g:2753:3: lv_name_1_0= rulecomponent_class_name
            {
             
            	        newCompositeNode(grammarAccess.getCompositeCompClassAccess().getNameComponent_class_nameParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_34);
            lv_name_1_0=rulecomponent_class_name();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompositeCompClassRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.component_class_name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,34,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getCompositeCompClassAccess().getIdKeyword_2());
                
            // InternalDedalADL.g:2773:1: ( (lv_id_3_0= ruleEString ) )
            // InternalDedalADL.g:2774:1: (lv_id_3_0= ruleEString )
            {
            // InternalDedalADL.g:2774:1: (lv_id_3_0= ruleEString )
            // InternalDedalADL.g:2775:3: lv_id_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCompositeCompClassAccess().getIdEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_71);
            lv_id_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompositeCompClassRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_3_0, 
                    		"fr.ema.dedal.xtext.DedalADL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,50,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getCompositeCompClassAccess().getImplementsKeyword_4());
                
            // InternalDedalADL.g:2795:1: ( ( ruleEString ) )
            // InternalDedalADL.g:2796:1: ( ruleEString )
            {
            // InternalDedalADL.g:2796:1: ( ruleEString )
            // InternalDedalADL.g:2797:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCompositeCompClassRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCompositeCompClassAccess().getImplementsCompTypeCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_77);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:2810:2: (otherlv_6= 'content' ( ( ruleEString ) ) (otherlv_8= '(' this_REVISION_NUMB_9= RULE_REVISION_NUMB otherlv_10= ')' )? )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==58) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalDedalADL.g:2810:4: otherlv_6= 'content' ( ( ruleEString ) ) (otherlv_8= '(' this_REVISION_NUMB_9= RULE_REVISION_NUMB otherlv_10= ')' )?
                    {
                    otherlv_6=(Token)match(input,58,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_6, grammarAccess.getCompositeCompClassAccess().getContentKeyword_6_0());
                        
                    // InternalDedalADL.g:2814:1: ( ( ruleEString ) )
                    // InternalDedalADL.g:2815:1: ( ruleEString )
                    {
                    // InternalDedalADL.g:2815:1: ( ruleEString )
                    // InternalDedalADL.g:2816:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCompositeCompClassRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCompositeCompClassAccess().getUsesConfigurationCrossReference_6_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_78);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:2829:2: (otherlv_8= '(' this_REVISION_NUMB_9= RULE_REVISION_NUMB otherlv_10= ')' )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==14) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalDedalADL.g:2829:4: otherlv_8= '(' this_REVISION_NUMB_9= RULE_REVISION_NUMB otherlv_10= ')'
                            {
                            otherlv_8=(Token)match(input,14,FollowSets000.FOLLOW_28); 

                                	newLeafNode(otherlv_8, grammarAccess.getCompositeCompClassAccess().getLeftParenthesisKeyword_6_2_0());
                                
                            this_REVISION_NUMB_9=(Token)match(input,RULE_REVISION_NUMB,FollowSets000.FOLLOW_53); 
                             
                                newLeafNode(this_REVISION_NUMB_9, grammarAccess.getCompositeCompClassAccess().getREVISION_NUMBTerminalRuleCall_6_2_1()); 
                                
                            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_79); 

                                	newLeafNode(otherlv_10, grammarAccess.getCompositeCompClassAccess().getRightParenthesisKeyword_6_2_2());
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalDedalADL.g:2841:5: (otherlv_11= 'delegated_interfaces' ruledelegated_interface_list )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==62) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalDedalADL.g:2841:7: otherlv_11= 'delegated_interfaces' ruledelegated_interface_list
                    {
                    otherlv_11=(Token)match(input,62,FollowSets000.FOLLOW_44); 

                        	newLeafNode(otherlv_11, grammarAccess.getCompositeCompClassAccess().getDelegated_interfacesKeyword_7_0());
                        
                     
                            newCompositeNode(grammarAccess.getCompositeCompClassAccess().getDelegated_interface_listParserRuleCall_7_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_80);
                    ruledelegated_interface_list();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // InternalDedalADL.g:2853:3: (otherlv_13= 'attributes' otherlv_14= '(' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ';' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= ')' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==59) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalDedalADL.g:2853:5: otherlv_13= 'attributes' otherlv_14= '(' ( (lv_attributes_15_0= ruleAttribute ) ) (otherlv_16= ';' ( (lv_attributes_17_0= ruleAttribute ) ) )* otherlv_18= ')'
                    {
                    otherlv_13=(Token)match(input,59,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_13, grammarAccess.getCompositeCompClassAccess().getAttributesKeyword_8_0());
                        
                    otherlv_14=(Token)match(input,14,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_14, grammarAccess.getCompositeCompClassAccess().getLeftParenthesisKeyword_8_1());
                        
                    // InternalDedalADL.g:2861:1: ( (lv_attributes_15_0= ruleAttribute ) )
                    // InternalDedalADL.g:2862:1: (lv_attributes_15_0= ruleAttribute )
                    {
                    // InternalDedalADL.g:2862:1: (lv_attributes_15_0= ruleAttribute )
                    // InternalDedalADL.g:2863:3: lv_attributes_15_0= ruleAttribute
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompositeCompClassAccess().getAttributesAttributeParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_attributes_15_0=ruleAttribute();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompositeCompClassRule());
                    	        }
                           		add(
                           			current, 
                           			"attributes",
                            		lv_attributes_15_0, 
                            		"fr.ema.dedal.xtext.DedalADL.Attribute");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:2879:2: (otherlv_16= ';' ( (lv_attributes_17_0= ruleAttribute ) ) )*
                    loop74:
                    do {
                        int alt74=2;
                        int LA74_0 = input.LA(1);

                        if ( (LA74_0==15) ) {
                            alt74=1;
                        }


                        switch (alt74) {
                    	case 1 :
                    	    // InternalDedalADL.g:2879:4: otherlv_16= ';' ( (lv_attributes_17_0= ruleAttribute ) )
                    	    {
                    	    otherlv_16=(Token)match(input,15,FollowSets000.FOLLOW_3); 

                    	        	newLeafNode(otherlv_16, grammarAccess.getCompositeCompClassAccess().getSemicolonKeyword_8_3_0());
                    	        
                    	    // InternalDedalADL.g:2883:1: ( (lv_attributes_17_0= ruleAttribute ) )
                    	    // InternalDedalADL.g:2884:1: (lv_attributes_17_0= ruleAttribute )
                    	    {
                    	    // InternalDedalADL.g:2884:1: (lv_attributes_17_0= ruleAttribute )
                    	    // InternalDedalADL.g:2885:3: lv_attributes_17_0= ruleAttribute
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCompositeCompClassAccess().getAttributesAttributeParserRuleCall_8_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_attributes_17_0=ruleAttribute();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCompositeCompClassRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"attributes",
                    	            		lv_attributes_17_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.Attribute");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop74;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,16,FollowSets000.FOLLOW_81); 

                        	newLeafNode(otherlv_18, grammarAccess.getCompositeCompClassAccess().getRightParenthesisKeyword_8_4());
                        

                    }
                    break;

            }

            // InternalDedalADL.g:2905:3: (otherlv_19= 'versionID' this_REVISION_NUMB_20= RULE_REVISION_NUMB )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==30) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalDedalADL.g:2905:5: otherlv_19= 'versionID' this_REVISION_NUMB_20= RULE_REVISION_NUMB
                    {
                    otherlv_19=(Token)match(input,30,FollowSets000.FOLLOW_28); 

                        	newLeafNode(otherlv_19, grammarAccess.getCompositeCompClassAccess().getVersionIDKeyword_9_0());
                        
                    this_REVISION_NUMB_20=(Token)match(input,RULE_REVISION_NUMB,FollowSets000.FOLLOW_82); 
                     
                        newLeafNode(this_REVISION_NUMB_20, grammarAccess.getCompositeCompClassAccess().getREVISION_NUMBTerminalRuleCall_9_1()); 
                        

                    }
                    break;

            }

            // InternalDedalADL.g:2913:3: (otherlv_21= 'pre_version' this_REVISION_NUMB_22= RULE_REVISION_NUMB )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==31) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalDedalADL.g:2913:5: otherlv_21= 'pre_version' this_REVISION_NUMB_22= RULE_REVISION_NUMB
                    {
                    otherlv_21=(Token)match(input,31,FollowSets000.FOLLOW_28); 

                        	newLeafNode(otherlv_21, grammarAccess.getCompositeCompClassAccess().getPre_versionKeyword_10_0());
                        
                    this_REVISION_NUMB_22=(Token)match(input,RULE_REVISION_NUMB,FollowSets000.FOLLOW_83); 
                     
                        newLeafNode(this_REVISION_NUMB_22, grammarAccess.getCompositeCompClassAccess().getREVISION_NUMBTerminalRuleCall_10_1()); 
                        

                    }
                    break;

            }

            // InternalDedalADL.g:2921:3: (otherlv_23= 'realizes' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ';' ( ( ruleEString ) ) )* otherlv_28= ')' )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==63) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // InternalDedalADL.g:2921:5: otherlv_23= 'realizes' otherlv_24= '(' ( ( ruleEString ) ) (otherlv_26= ';' ( ( ruleEString ) ) )* otherlv_28= ')'
                    {
                    otherlv_23=(Token)match(input,63,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_23, grammarAccess.getCompositeCompClassAccess().getRealizesKeyword_11_0());
                        
                    otherlv_24=(Token)match(input,14,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_24, grammarAccess.getCompositeCompClassAccess().getLeftParenthesisKeyword_11_1());
                        
                    // InternalDedalADL.g:2929:1: ( ( ruleEString ) )
                    // InternalDedalADL.g:2930:1: ( ruleEString )
                    {
                    // InternalDedalADL.g:2930:1: ( ruleEString )
                    // InternalDedalADL.g:2931:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCompositeCompClassRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCompositeCompClassAccess().getRealizesCompRoleCrossReference_11_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_7);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:2944:2: (otherlv_26= ';' ( ( ruleEString ) ) )*
                    loop78:
                    do {
                        int alt78=2;
                        int LA78_0 = input.LA(1);

                        if ( (LA78_0==15) ) {
                            alt78=1;
                        }


                        switch (alt78) {
                    	case 1 :
                    	    // InternalDedalADL.g:2944:4: otherlv_26= ';' ( ( ruleEString ) )
                    	    {
                    	    otherlv_26=(Token)match(input,15,FollowSets000.FOLLOW_3); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getCompositeCompClassAccess().getSemicolonKeyword_11_3_0());
                    	        
                    	    // InternalDedalADL.g:2948:1: ( ( ruleEString ) )
                    	    // InternalDedalADL.g:2949:1: ( ruleEString )
                    	    {
                    	    // InternalDedalADL.g:2949:1: ( ruleEString )
                    	    // InternalDedalADL.g:2950:3: ruleEString
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getCompositeCompClassRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getCompositeCompClassAccess().getRealizesCompRoleCrossReference_11_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    ruleEString();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop78;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,16,FollowSets000.FOLLOW_84); 

                        	newLeafNode(otherlv_28, grammarAccess.getCompositeCompClassAccess().getRightParenthesisKeyword_11_4());
                        

                    }
                    break;

            }

            // InternalDedalADL.g:2967:3: (otherlv_29= 'interfaces' ( (lv_compInterfaces_30_0= ruleInteraction ) ) (otherlv_31= ';' ( (lv_compInterfaces_32_0= ruleInteraction ) ) )* )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==60) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalDedalADL.g:2967:5: otherlv_29= 'interfaces' ( (lv_compInterfaces_30_0= ruleInteraction ) ) (otherlv_31= ';' ( (lv_compInterfaces_32_0= ruleInteraction ) ) )*
                    {
                    otherlv_29=(Token)match(input,60,FollowSets000.FOLLOW_42); 

                        	newLeafNode(otherlv_29, grammarAccess.getCompositeCompClassAccess().getInterfacesKeyword_12_0());
                        
                    // InternalDedalADL.g:2971:1: ( (lv_compInterfaces_30_0= ruleInteraction ) )
                    // InternalDedalADL.g:2972:1: (lv_compInterfaces_30_0= ruleInteraction )
                    {
                    // InternalDedalADL.g:2972:1: (lv_compInterfaces_30_0= ruleInteraction )
                    // InternalDedalADL.g:2973:3: lv_compInterfaces_30_0= ruleInteraction
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompositeCompClassAccess().getCompInterfacesInteractionParserRuleCall_12_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_85);
                    lv_compInterfaces_30_0=ruleInteraction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompositeCompClassRule());
                    	        }
                           		add(
                           			current, 
                           			"compInterfaces",
                            		lv_compInterfaces_30_0, 
                            		"fr.ema.dedal.xtext.DedalADL.Interaction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:2989:2: (otherlv_31= ';' ( (lv_compInterfaces_32_0= ruleInteraction ) ) )*
                    loop80:
                    do {
                        int alt80=2;
                        int LA80_0 = input.LA(1);

                        if ( (LA80_0==15) ) {
                            int LA80_2 = input.LA(2);

                            if ( (LA80_2==40||LA80_2==73||LA80_2==75) ) {
                                alt80=1;
                            }


                        }


                        switch (alt80) {
                    	case 1 :
                    	    // InternalDedalADL.g:2989:4: otherlv_31= ';' ( (lv_compInterfaces_32_0= ruleInteraction ) )
                    	    {
                    	    otherlv_31=(Token)match(input,15,FollowSets000.FOLLOW_42); 

                    	        	newLeafNode(otherlv_31, grammarAccess.getCompositeCompClassAccess().getSemicolonKeyword_12_2_0());
                    	        
                    	    // InternalDedalADL.g:2993:1: ( (lv_compInterfaces_32_0= ruleInteraction ) )
                    	    // InternalDedalADL.g:2994:1: (lv_compInterfaces_32_0= ruleInteraction )
                    	    {
                    	    // InternalDedalADL.g:2994:1: (lv_compInterfaces_32_0= ruleInteraction )
                    	    // InternalDedalADL.g:2995:3: lv_compInterfaces_32_0= ruleInteraction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCompositeCompClassAccess().getCompInterfacesInteractionParserRuleCall_12_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_85);
                    	    lv_compInterfaces_32_0=ruleInteraction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCompositeCompClassRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"compInterfaces",
                    	            		lv_compInterfaces_32_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.Interaction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop80;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalDedalADL.g:3011:6: (otherlv_33= 'delegated_old' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ';' ( (otherlv_36= RULE_ID ) ) )* )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==64) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalDedalADL.g:3011:8: otherlv_33= 'delegated_old' ( (otherlv_34= RULE_ID ) ) (otherlv_35= ';' ( (otherlv_36= RULE_ID ) ) )*
                    {
                    otherlv_33=(Token)match(input,64,FollowSets000.FOLLOW_22); 

                        	newLeafNode(otherlv_33, grammarAccess.getCompositeCompClassAccess().getDelegated_oldKeyword_13_0());
                        
                    // InternalDedalADL.g:3015:1: ( (otherlv_34= RULE_ID ) )
                    // InternalDedalADL.g:3016:1: (otherlv_34= RULE_ID )
                    {
                    // InternalDedalADL.g:3016:1: (otherlv_34= RULE_ID )
                    // InternalDedalADL.g:3017:3: otherlv_34= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCompositeCompClassRule());
                    	        }
                            
                    otherlv_34=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_33); 

                    		newLeafNode(otherlv_34, grammarAccess.getCompositeCompClassAccess().getDelegatedInterfacesInteractionCrossReference_13_1_0()); 
                    	

                    }


                    }

                    // InternalDedalADL.g:3028:2: (otherlv_35= ';' ( (otherlv_36= RULE_ID ) ) )*
                    loop82:
                    do {
                        int alt82=2;
                        int LA82_0 = input.LA(1);

                        if ( (LA82_0==15) ) {
                            int LA82_2 = input.LA(2);

                            if ( (LA82_2==RULE_ID) ) {
                                alt82=1;
                            }


                        }


                        switch (alt82) {
                    	case 1 :
                    	    // InternalDedalADL.g:3028:4: otherlv_35= ';' ( (otherlv_36= RULE_ID ) )
                    	    {
                    	    otherlv_35=(Token)match(input,15,FollowSets000.FOLLOW_22); 

                    	        	newLeafNode(otherlv_35, grammarAccess.getCompositeCompClassAccess().getSemicolonKeyword_13_2_0());
                    	        
                    	    // InternalDedalADL.g:3032:1: ( (otherlv_36= RULE_ID ) )
                    	    // InternalDedalADL.g:3033:1: (otherlv_36= RULE_ID )
                    	    {
                    	    // InternalDedalADL.g:3033:1: (otherlv_36= RULE_ID )
                    	    // InternalDedalADL.g:3034:3: otherlv_36= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getCompositeCompClassRule());
                    	    	        }
                    	            
                    	    otherlv_36=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_33); 

                    	    		newLeafNode(otherlv_36, grammarAccess.getCompositeCompClassAccess().getDelegatedInterfacesInteractionCrossReference_13_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop82;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeCompClass"


    // $ANTLR start "entryRuledelegated_interface_list"
    // InternalDedalADL.g:3053:1: entryRuledelegated_interface_list returns [String current=null] : iv_ruledelegated_interface_list= ruledelegated_interface_list EOF ;
    public final String entryRuledelegated_interface_list() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruledelegated_interface_list = null;


        try {
            // InternalDedalADL.g:3054:2: (iv_ruledelegated_interface_list= ruledelegated_interface_list EOF )
            // InternalDedalADL.g:3055:2: iv_ruledelegated_interface_list= ruledelegated_interface_list EOF
            {
             newCompositeNode(grammarAccess.getDelegated_interface_listRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruledelegated_interface_list=ruledelegated_interface_list();

            state._fsp--;

             current =iv_ruledelegated_interface_list.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledelegated_interface_list"


    // $ANTLR start "ruledelegated_interface_list"
    // InternalDedalADL.g:3062:1: ruledelegated_interface_list returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'provided' | (kw= 'required' this_inner_interface_2= ruleinner_interface kw= 'as' this_outer_interface_4= ruleouter_interface ( (kw= ';' kw= 'provided' ) | (kw= 'required' this_inner_interface_8= ruleinner_interface kw= 'as' this_outer_interface_10= ruleouter_interface ) )* ) ) ;
    public final AntlrDatatypeRuleToken ruledelegated_interface_list() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_inner_interface_2 = null;

        AntlrDatatypeRuleToken this_outer_interface_4 = null;

        AntlrDatatypeRuleToken this_inner_interface_8 = null;

        AntlrDatatypeRuleToken this_outer_interface_10 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:3065:28: ( (kw= 'provided' | (kw= 'required' this_inner_interface_2= ruleinner_interface kw= 'as' this_outer_interface_4= ruleouter_interface ( (kw= ';' kw= 'provided' ) | (kw= 'required' this_inner_interface_8= ruleinner_interface kw= 'as' this_outer_interface_10= ruleouter_interface ) )* ) ) )
            // InternalDedalADL.g:3066:1: (kw= 'provided' | (kw= 'required' this_inner_interface_2= ruleinner_interface kw= 'as' this_outer_interface_4= ruleouter_interface ( (kw= ';' kw= 'provided' ) | (kw= 'required' this_inner_interface_8= ruleinner_interface kw= 'as' this_outer_interface_10= ruleouter_interface ) )* ) )
            {
            // InternalDedalADL.g:3066:1: (kw= 'provided' | (kw= 'required' this_inner_interface_2= ruleinner_interface kw= 'as' this_outer_interface_4= ruleouter_interface ( (kw= ';' kw= 'provided' ) | (kw= 'required' this_inner_interface_8= ruleinner_interface kw= 'as' this_outer_interface_10= ruleouter_interface ) )* ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==65) ) {
                alt85=1;
            }
            else if ( (LA85_0==66) ) {
                alt85=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalDedalADL.g:3067:2: kw= 'provided'
                    {
                    kw=(Token)match(input,65,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDelegated_interface_listAccess().getProvidedKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:3073:6: (kw= 'required' this_inner_interface_2= ruleinner_interface kw= 'as' this_outer_interface_4= ruleouter_interface ( (kw= ';' kw= 'provided' ) | (kw= 'required' this_inner_interface_8= ruleinner_interface kw= 'as' this_outer_interface_10= ruleouter_interface ) )* )
                    {
                    // InternalDedalADL.g:3073:6: (kw= 'required' this_inner_interface_2= ruleinner_interface kw= 'as' this_outer_interface_4= ruleouter_interface ( (kw= ';' kw= 'provided' ) | (kw= 'required' this_inner_interface_8= ruleinner_interface kw= 'as' this_outer_interface_10= ruleouter_interface ) )* )
                    // InternalDedalADL.g:3074:2: kw= 'required' this_inner_interface_2= ruleinner_interface kw= 'as' this_outer_interface_4= ruleouter_interface ( (kw= ';' kw= 'provided' ) | (kw= 'required' this_inner_interface_8= ruleinner_interface kw= 'as' this_outer_interface_10= ruleouter_interface ) )*
                    {
                    kw=(Token)match(input,66,FollowSets000.FOLLOW_22); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDelegated_interface_listAccess().getRequiredKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getDelegated_interface_listAccess().getInner_interfaceParserRuleCall_1_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_61);
                    this_inner_interface_2=ruleinner_interface();

                    state._fsp--;


                    		current.merge(this_inner_interface_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    kw=(Token)match(input,53,FollowSets000.FOLLOW_22); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getDelegated_interface_listAccess().getAsKeyword_1_2()); 
                        
                     
                            newCompositeNode(grammarAccess.getDelegated_interface_listAccess().getOuter_interfaceParserRuleCall_1_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_86);
                    this_outer_interface_4=ruleouter_interface();

                    state._fsp--;


                    		current.merge(this_outer_interface_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // InternalDedalADL.g:3107:1: ( (kw= ';' kw= 'provided' ) | (kw= 'required' this_inner_interface_8= ruleinner_interface kw= 'as' this_outer_interface_10= ruleouter_interface ) )*
                    loop84:
                    do {
                        int alt84=3;
                        int LA84_0 = input.LA(1);

                        if ( (LA84_0==15) ) {
                            int LA84_2 = input.LA(2);

                            if ( (LA84_2==65) ) {
                                alt84=1;
                            }


                        }
                        else if ( (LA84_0==66) ) {
                            alt84=2;
                        }


                        switch (alt84) {
                    	case 1 :
                    	    // InternalDedalADL.g:3107:2: (kw= ';' kw= 'provided' )
                    	    {
                    	    // InternalDedalADL.g:3107:2: (kw= ';' kw= 'provided' )
                    	    // InternalDedalADL.g:3108:2: kw= ';' kw= 'provided'
                    	    {
                    	    kw=(Token)match(input,15,FollowSets000.FOLLOW_87); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getDelegated_interface_listAccess().getSemicolonKeyword_1_4_0_0()); 
                    	        
                    	    kw=(Token)match(input,65,FollowSets000.FOLLOW_86); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getDelegated_interface_listAccess().getProvidedKeyword_1_4_0_1()); 
                    	        

                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDedalADL.g:3120:6: (kw= 'required' this_inner_interface_8= ruleinner_interface kw= 'as' this_outer_interface_10= ruleouter_interface )
                    	    {
                    	    // InternalDedalADL.g:3120:6: (kw= 'required' this_inner_interface_8= ruleinner_interface kw= 'as' this_outer_interface_10= ruleouter_interface )
                    	    // InternalDedalADL.g:3121:2: kw= 'required' this_inner_interface_8= ruleinner_interface kw= 'as' this_outer_interface_10= ruleouter_interface
                    	    {
                    	    kw=(Token)match(input,66,FollowSets000.FOLLOW_22); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getDelegated_interface_listAccess().getRequiredKeyword_1_4_1_0()); 
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getDelegated_interface_listAccess().getInner_interfaceParserRuleCall_1_4_1_1()); 
                    	        
                    	    pushFollow(FollowSets000.FOLLOW_61);
                    	    this_inner_interface_8=ruleinner_interface();

                    	    state._fsp--;


                    	    		current.merge(this_inner_interface_8);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        
                    	    kw=(Token)match(input,53,FollowSets000.FOLLOW_22); 

                    	            current.merge(kw);
                    	            newLeafNode(kw, grammarAccess.getDelegated_interface_listAccess().getAsKeyword_1_4_1_2()); 
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getDelegated_interface_listAccess().getOuter_interfaceParserRuleCall_1_4_1_3()); 
                    	        
                    	    pushFollow(FollowSets000.FOLLOW_86);
                    	    this_outer_interface_10=ruleouter_interface();

                    	    state._fsp--;


                    	    		current.merge(this_outer_interface_10);
                    	        
                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop84;
                        }
                    } while (true);


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledelegated_interface_list"


    // $ANTLR start "entryRuleinner_interface"
    // InternalDedalADL.g:3162:1: entryRuleinner_interface returns [String current=null] : iv_ruleinner_interface= ruleinner_interface EOF ;
    public final String entryRuleinner_interface() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinner_interface = null;


        try {
            // InternalDedalADL.g:3163:2: (iv_ruleinner_interface= ruleinner_interface EOF )
            // InternalDedalADL.g:3164:2: iv_ruleinner_interface= ruleinner_interface EOF
            {
             newCompositeNode(grammarAccess.getInner_interfaceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleinner_interface=ruleinner_interface();

            state._fsp--;

             current =iv_ruleinner_interface.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinner_interface"


    // $ANTLR start "ruleinner_interface"
    // InternalDedalADL.g:3171:1: ruleinner_interface returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_component_class_identifier_0= rulecomponent_class_identifier kw= '[' this_component_role_name_2= rulecomponent_role_name kw= ']' kw= '.' this_interface_name_5= ruleinterface_name ) ;
    public final AntlrDatatypeRuleToken ruleinner_interface() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_component_class_identifier_0 = null;

        AntlrDatatypeRuleToken this_component_role_name_2 = null;

        AntlrDatatypeRuleToken this_interface_name_5 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:3174:28: ( (this_component_class_identifier_0= rulecomponent_class_identifier kw= '[' this_component_role_name_2= rulecomponent_role_name kw= ']' kw= '.' this_interface_name_5= ruleinterface_name ) )
            // InternalDedalADL.g:3175:1: (this_component_class_identifier_0= rulecomponent_class_identifier kw= '[' this_component_role_name_2= rulecomponent_role_name kw= ']' kw= '.' this_interface_name_5= ruleinterface_name )
            {
            // InternalDedalADL.g:3175:1: (this_component_class_identifier_0= rulecomponent_class_identifier kw= '[' this_component_role_name_2= rulecomponent_role_name kw= ']' kw= '.' this_interface_name_5= ruleinterface_name )
            // InternalDedalADL.g:3176:5: this_component_class_identifier_0= rulecomponent_class_identifier kw= '[' this_component_role_name_2= rulecomponent_role_name kw= ']' kw= '.' this_interface_name_5= ruleinterface_name
            {
             
                    newCompositeNode(grammarAccess.getInner_interfaceAccess().getComponent_class_identifierParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_88);
            this_component_class_identifier_0=rulecomponent_class_identifier();

            state._fsp--;


            		current.merge(this_component_class_identifier_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,67,FollowSets000.FOLLOW_22); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInner_interfaceAccess().getLeftSquareBracketKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getInner_interfaceAccess().getComponent_role_nameParserRuleCall_2()); 
                
            pushFollow(FollowSets000.FOLLOW_89);
            this_component_role_name_2=rulecomponent_role_name();

            state._fsp--;


            		current.merge(this_component_role_name_2);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,68,FollowSets000.FOLLOW_49); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInner_interfaceAccess().getRightSquareBracketKeyword_3()); 
                
            kw=(Token)match(input,47,FollowSets000.FOLLOW_22); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInner_interfaceAccess().getFullStopKeyword_4()); 
                
             
                    newCompositeNode(grammarAccess.getInner_interfaceAccess().getInterface_nameParserRuleCall_5()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
            this_interface_name_5=ruleinterface_name();

            state._fsp--;


            		current.merge(this_interface_name_5);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinner_interface"


    // $ANTLR start "entryRuleouter_interface"
    // InternalDedalADL.g:3234:1: entryRuleouter_interface returns [String current=null] : iv_ruleouter_interface= ruleouter_interface EOF ;
    public final String entryRuleouter_interface() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleouter_interface = null;


        try {
            // InternalDedalADL.g:3235:2: (iv_ruleouter_interface= ruleouter_interface EOF )
            // InternalDedalADL.g:3236:2: iv_ruleouter_interface= ruleouter_interface EOF
            {
             newCompositeNode(grammarAccess.getOuter_interfaceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleouter_interface=ruleouter_interface();

            state._fsp--;

             current =iv_ruleouter_interface.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleouter_interface"


    // $ANTLR start "ruleouter_interface"
    // InternalDedalADL.g:3243:1: ruleouter_interface returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_component_type_name_0= rulecomponent_type_name kw= '.' this_interface_name_2= ruleinterface_name ) ;
    public final AntlrDatatypeRuleToken ruleouter_interface() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_component_type_name_0 = null;

        AntlrDatatypeRuleToken this_interface_name_2 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:3246:28: ( (this_component_type_name_0= rulecomponent_type_name kw= '.' this_interface_name_2= ruleinterface_name ) )
            // InternalDedalADL.g:3247:1: (this_component_type_name_0= rulecomponent_type_name kw= '.' this_interface_name_2= ruleinterface_name )
            {
            // InternalDedalADL.g:3247:1: (this_component_type_name_0= rulecomponent_type_name kw= '.' this_interface_name_2= ruleinterface_name )
            // InternalDedalADL.g:3248:5: this_component_type_name_0= rulecomponent_type_name kw= '.' this_interface_name_2= ruleinterface_name
            {
             
                    newCompositeNode(grammarAccess.getOuter_interfaceAccess().getComponent_type_nameParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_49);
            this_component_type_name_0=rulecomponent_type_name();

            state._fsp--;


            		current.merge(this_component_type_name_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,47,FollowSets000.FOLLOW_22); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getOuter_interfaceAccess().getFullStopKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getOuter_interfaceAccess().getInterface_nameParserRuleCall_2()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
            this_interface_name_2=ruleinterface_name();

            state._fsp--;


            		current.merge(this_interface_name_2);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleouter_interface"


    // $ANTLR start "entryRulecomponent_class_identifier"
    // InternalDedalADL.g:3283:1: entryRulecomponent_class_identifier returns [String current=null] : iv_rulecomponent_class_identifier= rulecomponent_class_identifier EOF ;
    public final String entryRulecomponent_class_identifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecomponent_class_identifier = null;


        try {
            // InternalDedalADL.g:3284:2: (iv_rulecomponent_class_identifier= rulecomponent_class_identifier EOF )
            // InternalDedalADL.g:3285:2: iv_rulecomponent_class_identifier= rulecomponent_class_identifier EOF
            {
             newCompositeNode(grammarAccess.getComponent_class_identifierRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulecomponent_class_identifier=rulecomponent_class_identifier();

            state._fsp--;

             current =iv_rulecomponent_class_identifier.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecomponent_class_identifier"


    // $ANTLR start "rulecomponent_class_identifier"
    // InternalDedalADL.g:3292:1: rulecomponent_class_identifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_component_class_name_0= rulecomponent_class_name (kw= '(' this_REVISION_NUMB_2= RULE_REVISION_NUMB kw= ')' )? ) ;
    public final AntlrDatatypeRuleToken rulecomponent_class_identifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_REVISION_NUMB_2=null;
        AntlrDatatypeRuleToken this_component_class_name_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:3295:28: ( (this_component_class_name_0= rulecomponent_class_name (kw= '(' this_REVISION_NUMB_2= RULE_REVISION_NUMB kw= ')' )? ) )
            // InternalDedalADL.g:3296:1: (this_component_class_name_0= rulecomponent_class_name (kw= '(' this_REVISION_NUMB_2= RULE_REVISION_NUMB kw= ')' )? )
            {
            // InternalDedalADL.g:3296:1: (this_component_class_name_0= rulecomponent_class_name (kw= '(' this_REVISION_NUMB_2= RULE_REVISION_NUMB kw= ')' )? )
            // InternalDedalADL.g:3297:5: this_component_class_name_0= rulecomponent_class_name (kw= '(' this_REVISION_NUMB_2= RULE_REVISION_NUMB kw= ')' )?
            {
             
                    newCompositeNode(grammarAccess.getComponent_class_identifierAccess().getComponent_class_nameParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_90);
            this_component_class_name_0=rulecomponent_class_name();

            state._fsp--;


            		current.merge(this_component_class_name_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalDedalADL.g:3307:1: (kw= '(' this_REVISION_NUMB_2= RULE_REVISION_NUMB kw= ')' )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==14) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalDedalADL.g:3308:2: kw= '(' this_REVISION_NUMB_2= RULE_REVISION_NUMB kw= ')'
                    {
                    kw=(Token)match(input,14,FollowSets000.FOLLOW_28); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getComponent_class_identifierAccess().getLeftParenthesisKeyword_1_0()); 
                        
                    this_REVISION_NUMB_2=(Token)match(input,RULE_REVISION_NUMB,FollowSets000.FOLLOW_53); 

                    		current.merge(this_REVISION_NUMB_2);
                        
                     
                        newLeafNode(this_REVISION_NUMB_2, grammarAccess.getComponent_class_identifierAccess().getREVISION_NUMBTerminalRuleCall_1_1()); 
                        
                    kw=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getComponent_class_identifierAccess().getRightParenthesisKeyword_1_2()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecomponent_class_identifier"


    // $ANTLR start "entryRuleconnector_type"
    // InternalDedalADL.g:3334:1: entryRuleconnector_type returns [String current=null] : iv_ruleconnector_type= ruleconnector_type EOF ;
    public final String entryRuleconnector_type() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconnector_type = null;


        try {
            // InternalDedalADL.g:3335:2: (iv_ruleconnector_type= ruleconnector_type EOF )
            // InternalDedalADL.g:3336:2: iv_ruleconnector_type= ruleconnector_type EOF
            {
             newCompositeNode(grammarAccess.getConnector_typeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleconnector_type=ruleconnector_type();

            state._fsp--;

             current =iv_ruleconnector_type.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconnector_type"


    // $ANTLR start "ruleconnector_type"
    // InternalDedalADL.g:3343:1: ruleconnector_type returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'connector_type' this_connector_type_name_1= ruleconnector_type_name kw= 'provided_interfaces' this_interface_name_3= ruleinterface_name (kw= ';' this_interface_name_5= ruleinterface_name )* kw= 'required_interfaces' this_interface_name_7= ruleinterface_name (kw= ';' this_interface_name_9= ruleinterface_name )* ) ;
    public final AntlrDatatypeRuleToken ruleconnector_type() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_connector_type_name_1 = null;

        AntlrDatatypeRuleToken this_interface_name_3 = null;

        AntlrDatatypeRuleToken this_interface_name_5 = null;

        AntlrDatatypeRuleToken this_interface_name_7 = null;

        AntlrDatatypeRuleToken this_interface_name_9 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:3346:28: ( (kw= 'connector_type' this_connector_type_name_1= ruleconnector_type_name kw= 'provided_interfaces' this_interface_name_3= ruleinterface_name (kw= ';' this_interface_name_5= ruleinterface_name )* kw= 'required_interfaces' this_interface_name_7= ruleinterface_name (kw= ';' this_interface_name_9= ruleinterface_name )* ) )
            // InternalDedalADL.g:3347:1: (kw= 'connector_type' this_connector_type_name_1= ruleconnector_type_name kw= 'provided_interfaces' this_interface_name_3= ruleinterface_name (kw= ';' this_interface_name_5= ruleinterface_name )* kw= 'required_interfaces' this_interface_name_7= ruleinterface_name (kw= ';' this_interface_name_9= ruleinterface_name )* )
            {
            // InternalDedalADL.g:3347:1: (kw= 'connector_type' this_connector_type_name_1= ruleconnector_type_name kw= 'provided_interfaces' this_interface_name_3= ruleinterface_name (kw= ';' this_interface_name_5= ruleinterface_name )* kw= 'required_interfaces' this_interface_name_7= ruleinterface_name (kw= ';' this_interface_name_9= ruleinterface_name )* )
            // InternalDedalADL.g:3348:2: kw= 'connector_type' this_connector_type_name_1= ruleconnector_type_name kw= 'provided_interfaces' this_interface_name_3= ruleinterface_name (kw= ';' this_interface_name_5= ruleinterface_name )* kw= 'required_interfaces' this_interface_name_7= ruleinterface_name (kw= ';' this_interface_name_9= ruleinterface_name )*
            {
            kw=(Token)match(input,69,FollowSets000.FOLLOW_22); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConnector_typeAccess().getConnector_typeKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getConnector_typeAccess().getConnector_type_nameParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_91);
            this_connector_type_name_1=ruleconnector_type_name();

            state._fsp--;


            		current.merge(this_connector_type_name_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,36,FollowSets000.FOLLOW_22); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConnector_typeAccess().getProvided_interfacesKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getConnector_typeAccess().getInterface_nameParserRuleCall_3()); 
                
            pushFollow(FollowSets000.FOLLOW_92);
            this_interface_name_3=ruleinterface_name();

            state._fsp--;


            		current.merge(this_interface_name_3);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalDedalADL.g:3381:1: (kw= ';' this_interface_name_5= ruleinterface_name )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==15) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // InternalDedalADL.g:3382:2: kw= ';' this_interface_name_5= ruleinterface_name
            	    {
            	    kw=(Token)match(input,15,FollowSets000.FOLLOW_22); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getConnector_typeAccess().getSemicolonKeyword_4_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getConnector_typeAccess().getInterface_nameParserRuleCall_4_1()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_92);
            	    this_interface_name_5=ruleinterface_name();

            	    state._fsp--;


            	    		current.merge(this_interface_name_5);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);

            kw=(Token)match(input,35,FollowSets000.FOLLOW_22); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConnector_typeAccess().getRequired_interfacesKeyword_5()); 
                
             
                    newCompositeNode(grammarAccess.getConnector_typeAccess().getInterface_nameParserRuleCall_6()); 
                
            pushFollow(FollowSets000.FOLLOW_33);
            this_interface_name_7=ruleinterface_name();

            state._fsp--;


            		current.merge(this_interface_name_7);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalDedalADL.g:3415:1: (kw= ';' this_interface_name_9= ruleinterface_name )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==15) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // InternalDedalADL.g:3416:2: kw= ';' this_interface_name_9= ruleinterface_name
            	    {
            	    kw=(Token)match(input,15,FollowSets000.FOLLOW_22); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getConnector_typeAccess().getSemicolonKeyword_7_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getConnector_typeAccess().getInterface_nameParserRuleCall_7_1()); 
            	        
            	    pushFollow(FollowSets000.FOLLOW_33);
            	    this_interface_name_9=ruleinterface_name();

            	    state._fsp--;


            	    		current.merge(this_interface_name_9);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconnector_type"


    // $ANTLR start "entryRuleconnector_type_name"
    // InternalDedalADL.g:3440:1: entryRuleconnector_type_name returns [String current=null] : iv_ruleconnector_type_name= ruleconnector_type_name EOF ;
    public final String entryRuleconnector_type_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconnector_type_name = null;


        try {
            // InternalDedalADL.g:3441:2: (iv_ruleconnector_type_name= ruleconnector_type_name EOF )
            // InternalDedalADL.g:3442:2: iv_ruleconnector_type_name= ruleconnector_type_name EOF
            {
             newCompositeNode(grammarAccess.getConnector_type_nameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleconnector_type_name=ruleconnector_type_name();

            state._fsp--;

             current =iv_ruleconnector_type_name.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconnector_type_name"


    // $ANTLR start "ruleconnector_type_name"
    // InternalDedalADL.g:3449:1: ruleconnector_type_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleconnector_type_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:3452:28: (this_ID_0= RULE_ID )
            // InternalDedalADL.g:3453:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getConnector_type_nameAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconnector_type_name"


    // $ANTLR start "entryRuleconnector_class"
    // InternalDedalADL.g:3468:1: entryRuleconnector_class returns [String current=null] : iv_ruleconnector_class= ruleconnector_class EOF ;
    public final String entryRuleconnector_class() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconnector_class = null;


        try {
            // InternalDedalADL.g:3469:2: (iv_ruleconnector_class= ruleconnector_class EOF )
            // InternalDedalADL.g:3470:2: iv_ruleconnector_class= ruleconnector_class EOF
            {
             newCompositeNode(grammarAccess.getConnector_classRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleconnector_class=ruleconnector_class();

            state._fsp--;

             current =iv_ruleconnector_class.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconnector_class"


    // $ANTLR start "ruleconnector_class"
    // InternalDedalADL.g:3477:1: ruleconnector_class returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'connector' this_connector_class_name_1= ruleconnector_class_name kw= 'implements' this_connector_type_3= ruleconnector_type ) ;
    public final AntlrDatatypeRuleToken ruleconnector_class() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_connector_class_name_1 = null;

        AntlrDatatypeRuleToken this_connector_type_3 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:3480:28: ( (kw= 'connector' this_connector_class_name_1= ruleconnector_class_name kw= 'implements' this_connector_type_3= ruleconnector_type ) )
            // InternalDedalADL.g:3481:1: (kw= 'connector' this_connector_class_name_1= ruleconnector_class_name kw= 'implements' this_connector_type_3= ruleconnector_type )
            {
            // InternalDedalADL.g:3481:1: (kw= 'connector' this_connector_class_name_1= ruleconnector_class_name kw= 'implements' this_connector_type_3= ruleconnector_type )
            // InternalDedalADL.g:3482:2: kw= 'connector' this_connector_class_name_1= ruleconnector_class_name kw= 'implements' this_connector_type_3= ruleconnector_type
            {
            kw=(Token)match(input,70,FollowSets000.FOLLOW_22); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConnector_classAccess().getConnectorKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getConnector_classAccess().getConnector_class_nameParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_71);
            this_connector_class_name_1=ruleconnector_class_name();

            state._fsp--;


            		current.merge(this_connector_class_name_1);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,50,FollowSets000.FOLLOW_93); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConnector_classAccess().getImplementsKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getConnector_classAccess().getConnector_typeParserRuleCall_3()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
            this_connector_type_3=ruleconnector_type();

            state._fsp--;


            		current.merge(this_connector_type_3);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconnector_class"


    // $ANTLR start "entryRuleconnector_class_name"
    // InternalDedalADL.g:3523:1: entryRuleconnector_class_name returns [String current=null] : iv_ruleconnector_class_name= ruleconnector_class_name EOF ;
    public final String entryRuleconnector_class_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconnector_class_name = null;


        try {
            // InternalDedalADL.g:3524:2: (iv_ruleconnector_class_name= ruleconnector_class_name EOF )
            // InternalDedalADL.g:3525:2: iv_ruleconnector_class_name= ruleconnector_class_name EOF
            {
             newCompositeNode(grammarAccess.getConnector_class_nameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleconnector_class_name=ruleconnector_class_name();

            state._fsp--;

             current =iv_ruleconnector_class_name.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconnector_class_name"


    // $ANTLR start "ruleconnector_class_name"
    // InternalDedalADL.g:3532:1: ruleconnector_class_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleconnector_class_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:3535:28: (this_ID_0= RULE_ID )
            // InternalDedalADL.g:3536:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getConnector_class_nameAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconnector_class_name"


    // $ANTLR start "entryRuleClassConnection"
    // InternalDedalADL.g:3551:1: entryRuleClassConnection returns [EObject current=null] : iv_ruleClassConnection= ruleClassConnection EOF ;
    public final EObject entryRuleClassConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassConnection = null;


        try {
            // InternalDedalADL.g:3552:2: (iv_ruleClassConnection= ruleClassConnection EOF )
            // InternalDedalADL.g:3553:2: iv_ruleClassConnection= ruleClassConnection EOF
            {
             newCompositeNode(grammarAccess.getClassConnectionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleClassConnection=ruleClassConnection();

            state._fsp--;

             current =iv_ruleClassConnection; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassConnection"


    // $ANTLR start "ruleClassConnection"
    // InternalDedalADL.g:3560:1: ruleClassConnection returns [EObject current=null] : (otherlv_0= 'class_connection' ( (lv_refID_1_0= ruleEString ) ) otherlv_2= 'property' ( (lv_property_3_0= ruleEString ) ) otherlv_4= 'client' ( ( ruleEString ) ) otherlv_6= '.' ( ( ruleEString ) ) otherlv_8= 'server' ( ( ruleEString ) ) otherlv_10= '.' ( ( ruleEString ) ) ) ;
    public final EObject ruleClassConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_refID_1_0 = null;

        AntlrDatatypeRuleToken lv_property_3_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:3563:28: ( (otherlv_0= 'class_connection' ( (lv_refID_1_0= ruleEString ) ) otherlv_2= 'property' ( (lv_property_3_0= ruleEString ) ) otherlv_4= 'client' ( ( ruleEString ) ) otherlv_6= '.' ( ( ruleEString ) ) otherlv_8= 'server' ( ( ruleEString ) ) otherlv_10= '.' ( ( ruleEString ) ) ) )
            // InternalDedalADL.g:3564:1: (otherlv_0= 'class_connection' ( (lv_refID_1_0= ruleEString ) ) otherlv_2= 'property' ( (lv_property_3_0= ruleEString ) ) otherlv_4= 'client' ( ( ruleEString ) ) otherlv_6= '.' ( ( ruleEString ) ) otherlv_8= 'server' ( ( ruleEString ) ) otherlv_10= '.' ( ( ruleEString ) ) )
            {
            // InternalDedalADL.g:3564:1: (otherlv_0= 'class_connection' ( (lv_refID_1_0= ruleEString ) ) otherlv_2= 'property' ( (lv_property_3_0= ruleEString ) ) otherlv_4= 'client' ( ( ruleEString ) ) otherlv_6= '.' ( ( ruleEString ) ) otherlv_8= 'server' ( ( ruleEString ) ) otherlv_10= '.' ( ( ruleEString ) ) )
            // InternalDedalADL.g:3564:3: otherlv_0= 'class_connection' ( (lv_refID_1_0= ruleEString ) ) otherlv_2= 'property' ( (lv_property_3_0= ruleEString ) ) otherlv_4= 'client' ( ( ruleEString ) ) otherlv_6= '.' ( ( ruleEString ) ) otherlv_8= 'server' ( ( ruleEString ) ) otherlv_10= '.' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,71,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getClassConnectionAccess().getClass_connectionKeyword_0());
                
            // InternalDedalADL.g:3568:1: ( (lv_refID_1_0= ruleEString ) )
            // InternalDedalADL.g:3569:1: (lv_refID_1_0= ruleEString )
            {
            // InternalDedalADL.g:3569:1: (lv_refID_1_0= ruleEString )
            // InternalDedalADL.g:3570:3: lv_refID_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getClassConnectionAccess().getRefIDEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_94);
            lv_refID_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassConnectionRule());
            	        }
                   		set(
                   			current, 
                   			"refID",
                    		lv_refID_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,72,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getClassConnectionAccess().getPropertyKeyword_2());
                
            // InternalDedalADL.g:3590:1: ( (lv_property_3_0= ruleEString ) )
            // InternalDedalADL.g:3591:1: (lv_property_3_0= ruleEString )
            {
            // InternalDedalADL.g:3591:1: (lv_property_3_0= ruleEString )
            // InternalDedalADL.g:3592:3: lv_property_3_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getClassConnectionAccess().getPropertyEStringParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_48);
            lv_property_3_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getClassConnectionRule());
            	        }
                   		set(
                   			current, 
                   			"property",
                    		lv_property_3_0, 
                    		"fr.ema.dedal.xtext.DedalADL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,46,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getClassConnectionAccess().getClientKeyword_4());
                
            // InternalDedalADL.g:3612:1: ( ( ruleEString ) )
            // InternalDedalADL.g:3613:1: ( ruleEString )
            {
            // InternalDedalADL.g:3613:1: ( ruleEString )
            // InternalDedalADL.g:3614:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getClassConnectionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getClassConnectionAccess().getClientClassElemCompClassCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_49);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,47,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_6, grammarAccess.getClassConnectionAccess().getFullStopKeyword_6());
                
            // InternalDedalADL.g:3631:1: ( ( ruleEString ) )
            // InternalDedalADL.g:3632:1: ( ruleEString )
            {
            // InternalDedalADL.g:3632:1: ( ruleEString )
            // InternalDedalADL.g:3633:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getClassConnectionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getClassConnectionAccess().getClientIntElemInteractionCrossReference_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_50);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,48,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_8, grammarAccess.getClassConnectionAccess().getServerKeyword_8());
                
            // InternalDedalADL.g:3650:1: ( ( ruleEString ) )
            // InternalDedalADL.g:3651:1: ( ruleEString )
            {
            // InternalDedalADL.g:3651:1: ( ruleEString )
            // InternalDedalADL.g:3652:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getClassConnectionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getClassConnectionAccess().getServerClassElemCompClassCrossReference_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_49);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,47,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_10, grammarAccess.getClassConnectionAccess().getFullStopKeyword_10());
                
            // InternalDedalADL.g:3669:1: ( ( ruleEString ) )
            // InternalDedalADL.g:3670:1: ( ruleEString )
            {
            // InternalDedalADL.g:3670:1: ( ruleEString )
            // InternalDedalADL.g:3671:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getClassConnectionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getClassConnectionAccess().getServerIntElemInteractionCrossReference_11_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassConnection"


    // $ANTLR start "entryRulePort_Impl"
    // InternalDedalADL.g:3692:1: entryRulePort_Impl returns [EObject current=null] : iv_rulePort_Impl= rulePort_Impl EOF ;
    public final EObject entryRulePort_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort_Impl = null;


        try {
            // InternalDedalADL.g:3693:2: (iv_rulePort_Impl= rulePort_Impl EOF )
            // InternalDedalADL.g:3694:2: iv_rulePort_Impl= rulePort_Impl EOF
            {
             newCompositeNode(grammarAccess.getPort_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePort_Impl=rulePort_Impl();

            state._fsp--;

             current =iv_rulePort_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePort_Impl"


    // $ANTLR start "rulePort_Impl"
    // InternalDedalADL.g:3701:1: rulePort_Impl returns [EObject current=null] : (otherlv_0= 'port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'interfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' ) ;
    public final EObject rulePort_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:3704:28: ( (otherlv_0= 'port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'interfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' ) )
            // InternalDedalADL.g:3705:1: (otherlv_0= 'port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'interfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )
            {
            // InternalDedalADL.g:3705:1: (otherlv_0= 'port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'interfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )
            // InternalDedalADL.g:3705:3: otherlv_0= 'port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'interfaces' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,73,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getPort_ImplAccess().getPortKeyword_0());
                
            // InternalDedalADL.g:3709:1: ( (lv_name_1_0= ruleEString ) )
            // InternalDedalADL.g:3710:1: (lv_name_1_0= ruleEString )
            {
            // InternalDedalADL.g:3710:1: (lv_name_1_0= ruleEString )
            // InternalDedalADL.g:3711:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPort_ImplAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_95);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPort_ImplRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,60,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_2, grammarAccess.getPort_ImplAccess().getInterfacesKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_3, grammarAccess.getPort_ImplAccess().getLeftParenthesisKeyword_3());
                
            // InternalDedalADL.g:3735:1: ( ( ruleEString ) )
            // InternalDedalADL.g:3736:1: ( ruleEString )
            {
            // InternalDedalADL.g:3736:1: ( ruleEString )
            // InternalDedalADL.g:3737:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPort_ImplRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPort_ImplAccess().getInterfacesInterfaceCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_96);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:3750:2: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop89:
            do {
                int alt89=2;
                int LA89_0 = input.LA(1);

                if ( (LA89_0==74) ) {
                    alt89=1;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalDedalADL.g:3750:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,74,FollowSets000.FOLLOW_3); 

            	        	newLeafNode(otherlv_5, grammarAccess.getPort_ImplAccess().getCommaKeyword_5_0());
            	        
            	    // InternalDedalADL.g:3754:1: ( ( ruleEString ) )
            	    // InternalDedalADL.g:3755:1: ( ruleEString )
            	    {
            	    // InternalDedalADL.g:3755:1: ( ruleEString )
            	    // InternalDedalADL.g:3756:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getPort_ImplRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getPort_ImplAccess().getInterfacesInterfaceCrossReference_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_96);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop89;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getPort_ImplAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePort_Impl"


    // $ANTLR start "entryRuleCompositePort"
    // InternalDedalADL.g:3781:1: entryRuleCompositePort returns [EObject current=null] : iv_ruleCompositePort= ruleCompositePort EOF ;
    public final EObject entryRuleCompositePort() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositePort = null;


        try {
            // InternalDedalADL.g:3782:2: (iv_ruleCompositePort= ruleCompositePort EOF )
            // InternalDedalADL.g:3783:2: iv_ruleCompositePort= ruleCompositePort EOF
            {
             newCompositeNode(grammarAccess.getCompositePortRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompositePort=ruleCompositePort();

            state._fsp--;

             current =iv_ruleCompositePort; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositePort"


    // $ANTLR start "ruleCompositePort"
    // InternalDedalADL.g:3790:1: ruleCompositePort returns [EObject current=null] : (otherlv_0= 'composite_port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ports' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleCompositePort() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:3793:28: ( (otherlv_0= 'composite_port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ports' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' ) )
            // InternalDedalADL.g:3794:1: (otherlv_0= 'composite_port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ports' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )
            {
            // InternalDedalADL.g:3794:1: (otherlv_0= 'composite_port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ports' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')' )
            // InternalDedalADL.g:3794:3: otherlv_0= 'composite_port' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'ports' otherlv_3= '(' ( ( ruleEString ) ) (otherlv_5= ',' ( ( ruleEString ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,75,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getCompositePortAccess().getComposite_portKeyword_0());
                
            // InternalDedalADL.g:3798:1: ( (lv_name_1_0= ruleEString ) )
            // InternalDedalADL.g:3799:1: (lv_name_1_0= ruleEString )
            {
            // InternalDedalADL.g:3799:1: (lv_name_1_0= ruleEString )
            // InternalDedalADL.g:3800:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCompositePortAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_97);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompositePortRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,76,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_2, grammarAccess.getCompositePortAccess().getPortsKeyword_2());
                
            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_3, grammarAccess.getCompositePortAccess().getLeftParenthesisKeyword_3());
                
            // InternalDedalADL.g:3824:1: ( ( ruleEString ) )
            // InternalDedalADL.g:3825:1: ( ruleEString )
            {
            // InternalDedalADL.g:3825:1: ( ruleEString )
            // InternalDedalADL.g:3826:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCompositePortRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCompositePortAccess().getPortsPortCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_96);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:3839:2: (otherlv_5= ',' ( ( ruleEString ) ) )*
            loop90:
            do {
                int alt90=2;
                int LA90_0 = input.LA(1);

                if ( (LA90_0==74) ) {
                    alt90=1;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalDedalADL.g:3839:4: otherlv_5= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_5=(Token)match(input,74,FollowSets000.FOLLOW_3); 

            	        	newLeafNode(otherlv_5, grammarAccess.getCompositePortAccess().getCommaKeyword_5_0());
            	        
            	    // InternalDedalADL.g:3843:1: ( ( ruleEString ) )
            	    // InternalDedalADL.g:3844:1: ( ruleEString )
            	    {
            	    // InternalDedalADL.g:3844:1: ( ruleEString )
            	    // InternalDedalADL.g:3845:3: ruleEString
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getCompositePortRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getCompositePortAccess().getPortsPortCrossReference_5_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_96);
            	    ruleEString();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop90;
                }
            } while (true);

            otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                	newLeafNode(otherlv_7, grammarAccess.getCompositePortAccess().getRightParenthesisKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositePort"


    // $ANTLR start "entryRuleAssembly"
    // InternalDedalADL.g:3870:1: entryRuleAssembly returns [EObject current=null] : iv_ruleAssembly= ruleAssembly EOF ;
    public final EObject entryRuleAssembly() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssembly = null;


        try {
            // InternalDedalADL.g:3871:2: (iv_ruleAssembly= ruleAssembly EOF )
            // InternalDedalADL.g:3872:2: iv_ruleAssembly= ruleAssembly EOF
            {
             newCompositeNode(grammarAccess.getAssemblyRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAssembly=ruleAssembly();

            state._fsp--;

             current =iv_ruleAssembly; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssembly"


    // $ANTLR start "ruleAssembly"
    // InternalDedalADL.g:3879:1: ruleAssembly returns [EObject current=null] : (otherlv_0= 'assembly' ( (lv_name_1_0= ruleassembly_name ) ) otherlv_2= 'instance_of' ( ( ruleEString ) ) (otherlv_4= '(' this_REVISION_NUMB_5= RULE_REVISION_NUMB otherlv_6= ')' )? (otherlv_7= 'versionID' this_REVISION_NUMB_8= RULE_REVISION_NUMB )? otherlv_9= 'component_instances' otherlv_10= '(' ( (lv_assmComponents_11_0= ruleCompInstance ) ) (otherlv_12= ';' ( (lv_assmComponents_13_0= ruleCompInstance ) ) )* otherlv_14= ')' (otherlv_15= 'assembly_constraints' otherlv_16= '(' ruleConstraint (otherlv_18= ';' ruleConstraint )* otherlv_20= ')' )? (otherlv_21= 'pre_version' ruleversion )? (otherlv_23= 'by' rulechange )? (otherlv_25= 'interface_types' otherlv_26= '(' ( (lv_interfaceTypes_27_0= ruleInterfaceType ) ) (otherlv_28= ';' ( (lv_interfaceTypes_29_0= ruleInterfaceType ) ) )* otherlv_30= ')' )? (otherlv_31= 'assembly_connections' otherlv_32= '(' ( (lv_assemblyConnections_33_0= ruleInstConnection ) ) (otherlv_34= ';' ( (lv_assemblyConnections_35_0= ruleInstConnection ) ) )* otherlv_36= ')' )? ) ;
    public final EObject ruleAssembly() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token this_REVISION_NUMB_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token this_REVISION_NUMB_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_assmComponents_11_0 = null;

        EObject lv_assmComponents_13_0 = null;

        EObject lv_interfaceTypes_27_0 = null;

        EObject lv_interfaceTypes_29_0 = null;

        EObject lv_assemblyConnections_33_0 = null;

        EObject lv_assemblyConnections_35_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:3882:28: ( (otherlv_0= 'assembly' ( (lv_name_1_0= ruleassembly_name ) ) otherlv_2= 'instance_of' ( ( ruleEString ) ) (otherlv_4= '(' this_REVISION_NUMB_5= RULE_REVISION_NUMB otherlv_6= ')' )? (otherlv_7= 'versionID' this_REVISION_NUMB_8= RULE_REVISION_NUMB )? otherlv_9= 'component_instances' otherlv_10= '(' ( (lv_assmComponents_11_0= ruleCompInstance ) ) (otherlv_12= ';' ( (lv_assmComponents_13_0= ruleCompInstance ) ) )* otherlv_14= ')' (otherlv_15= 'assembly_constraints' otherlv_16= '(' ruleConstraint (otherlv_18= ';' ruleConstraint )* otherlv_20= ')' )? (otherlv_21= 'pre_version' ruleversion )? (otherlv_23= 'by' rulechange )? (otherlv_25= 'interface_types' otherlv_26= '(' ( (lv_interfaceTypes_27_0= ruleInterfaceType ) ) (otherlv_28= ';' ( (lv_interfaceTypes_29_0= ruleInterfaceType ) ) )* otherlv_30= ')' )? (otherlv_31= 'assembly_connections' otherlv_32= '(' ( (lv_assemblyConnections_33_0= ruleInstConnection ) ) (otherlv_34= ';' ( (lv_assemblyConnections_35_0= ruleInstConnection ) ) )* otherlv_36= ')' )? ) )
            // InternalDedalADL.g:3883:1: (otherlv_0= 'assembly' ( (lv_name_1_0= ruleassembly_name ) ) otherlv_2= 'instance_of' ( ( ruleEString ) ) (otherlv_4= '(' this_REVISION_NUMB_5= RULE_REVISION_NUMB otherlv_6= ')' )? (otherlv_7= 'versionID' this_REVISION_NUMB_8= RULE_REVISION_NUMB )? otherlv_9= 'component_instances' otherlv_10= '(' ( (lv_assmComponents_11_0= ruleCompInstance ) ) (otherlv_12= ';' ( (lv_assmComponents_13_0= ruleCompInstance ) ) )* otherlv_14= ')' (otherlv_15= 'assembly_constraints' otherlv_16= '(' ruleConstraint (otherlv_18= ';' ruleConstraint )* otherlv_20= ')' )? (otherlv_21= 'pre_version' ruleversion )? (otherlv_23= 'by' rulechange )? (otherlv_25= 'interface_types' otherlv_26= '(' ( (lv_interfaceTypes_27_0= ruleInterfaceType ) ) (otherlv_28= ';' ( (lv_interfaceTypes_29_0= ruleInterfaceType ) ) )* otherlv_30= ')' )? (otherlv_31= 'assembly_connections' otherlv_32= '(' ( (lv_assemblyConnections_33_0= ruleInstConnection ) ) (otherlv_34= ';' ( (lv_assemblyConnections_35_0= ruleInstConnection ) ) )* otherlv_36= ')' )? )
            {
            // InternalDedalADL.g:3883:1: (otherlv_0= 'assembly' ( (lv_name_1_0= ruleassembly_name ) ) otherlv_2= 'instance_of' ( ( ruleEString ) ) (otherlv_4= '(' this_REVISION_NUMB_5= RULE_REVISION_NUMB otherlv_6= ')' )? (otherlv_7= 'versionID' this_REVISION_NUMB_8= RULE_REVISION_NUMB )? otherlv_9= 'component_instances' otherlv_10= '(' ( (lv_assmComponents_11_0= ruleCompInstance ) ) (otherlv_12= ';' ( (lv_assmComponents_13_0= ruleCompInstance ) ) )* otherlv_14= ')' (otherlv_15= 'assembly_constraints' otherlv_16= '(' ruleConstraint (otherlv_18= ';' ruleConstraint )* otherlv_20= ')' )? (otherlv_21= 'pre_version' ruleversion )? (otherlv_23= 'by' rulechange )? (otherlv_25= 'interface_types' otherlv_26= '(' ( (lv_interfaceTypes_27_0= ruleInterfaceType ) ) (otherlv_28= ';' ( (lv_interfaceTypes_29_0= ruleInterfaceType ) ) )* otherlv_30= ')' )? (otherlv_31= 'assembly_connections' otherlv_32= '(' ( (lv_assemblyConnections_33_0= ruleInstConnection ) ) (otherlv_34= ';' ( (lv_assemblyConnections_35_0= ruleInstConnection ) ) )* otherlv_36= ')' )? )
            // InternalDedalADL.g:3883:3: otherlv_0= 'assembly' ( (lv_name_1_0= ruleassembly_name ) ) otherlv_2= 'instance_of' ( ( ruleEString ) ) (otherlv_4= '(' this_REVISION_NUMB_5= RULE_REVISION_NUMB otherlv_6= ')' )? (otherlv_7= 'versionID' this_REVISION_NUMB_8= RULE_REVISION_NUMB )? otherlv_9= 'component_instances' otherlv_10= '(' ( (lv_assmComponents_11_0= ruleCompInstance ) ) (otherlv_12= ';' ( (lv_assmComponents_13_0= ruleCompInstance ) ) )* otherlv_14= ')' (otherlv_15= 'assembly_constraints' otherlv_16= '(' ruleConstraint (otherlv_18= ';' ruleConstraint )* otherlv_20= ')' )? (otherlv_21= 'pre_version' ruleversion )? (otherlv_23= 'by' rulechange )? (otherlv_25= 'interface_types' otherlv_26= '(' ( (lv_interfaceTypes_27_0= ruleInterfaceType ) ) (otherlv_28= ';' ( (lv_interfaceTypes_29_0= ruleInterfaceType ) ) )* otherlv_30= ')' )? (otherlv_31= 'assembly_connections' otherlv_32= '(' ( (lv_assemblyConnections_33_0= ruleInstConnection ) ) (otherlv_34= ';' ( (lv_assemblyConnections_35_0= ruleInstConnection ) ) )* otherlv_36= ')' )?
            {
            otherlv_0=(Token)match(input,77,FollowSets000.FOLLOW_22); 

                	newLeafNode(otherlv_0, grammarAccess.getAssemblyAccess().getAssemblyKeyword_0());
                
            // InternalDedalADL.g:3887:1: ( (lv_name_1_0= ruleassembly_name ) )
            // InternalDedalADL.g:3888:1: (lv_name_1_0= ruleassembly_name )
            {
            // InternalDedalADL.g:3888:1: (lv_name_1_0= ruleassembly_name )
            // InternalDedalADL.g:3889:3: lv_name_1_0= ruleassembly_name
            {
             
            	        newCompositeNode(grammarAccess.getAssemblyAccess().getNameAssembly_nameParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_98);
            lv_name_1_0=ruleassembly_name();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssemblyRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.assembly_name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,78,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getAssemblyAccess().getInstance_ofKeyword_2());
                
            // InternalDedalADL.g:3909:1: ( ( ruleEString ) )
            // InternalDedalADL.g:3910:1: ( ruleEString )
            {
            // InternalDedalADL.g:3910:1: ( ruleEString )
            // InternalDedalADL.g:3911:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getAssemblyRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getAssemblyAccess().getInstantiatesConfigurationCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_99);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:3924:2: (otherlv_4= '(' this_REVISION_NUMB_5= RULE_REVISION_NUMB otherlv_6= ')' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==14) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalDedalADL.g:3924:4: otherlv_4= '(' this_REVISION_NUMB_5= RULE_REVISION_NUMB otherlv_6= ')'
                    {
                    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_28); 

                        	newLeafNode(otherlv_4, grammarAccess.getAssemblyAccess().getLeftParenthesisKeyword_4_0());
                        
                    this_REVISION_NUMB_5=(Token)match(input,RULE_REVISION_NUMB,FollowSets000.FOLLOW_53); 
                     
                        newLeafNode(this_REVISION_NUMB_5, grammarAccess.getAssemblyAccess().getREVISION_NUMBTerminalRuleCall_4_1()); 
                        
                    otherlv_6=(Token)match(input,16,FollowSets000.FOLLOW_100); 

                        	newLeafNode(otherlv_6, grammarAccess.getAssemblyAccess().getRightParenthesisKeyword_4_2());
                        

                    }
                    break;

            }

            // InternalDedalADL.g:3936:3: (otherlv_7= 'versionID' this_REVISION_NUMB_8= RULE_REVISION_NUMB )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==30) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalDedalADL.g:3936:5: otherlv_7= 'versionID' this_REVISION_NUMB_8= RULE_REVISION_NUMB
                    {
                    otherlv_7=(Token)match(input,30,FollowSets000.FOLLOW_28); 

                        	newLeafNode(otherlv_7, grammarAccess.getAssemblyAccess().getVersionIDKeyword_5_0());
                        
                    this_REVISION_NUMB_8=(Token)match(input,RULE_REVISION_NUMB,FollowSets000.FOLLOW_101); 
                     
                        newLeafNode(this_REVISION_NUMB_8, grammarAccess.getAssemblyAccess().getREVISION_NUMBTerminalRuleCall_5_1()); 
                        

                    }
                    break;

            }

            otherlv_9=(Token)match(input,79,FollowSets000.FOLLOW_5); 

                	newLeafNode(otherlv_9, grammarAccess.getAssemblyAccess().getComponent_instancesKeyword_6());
                
            otherlv_10=(Token)match(input,14,FollowSets000.FOLLOW_102); 

                	newLeafNode(otherlv_10, grammarAccess.getAssemblyAccess().getLeftParenthesisKeyword_7());
                
            // InternalDedalADL.g:3952:1: ( (lv_assmComponents_11_0= ruleCompInstance ) )
            // InternalDedalADL.g:3953:1: (lv_assmComponents_11_0= ruleCompInstance )
            {
            // InternalDedalADL.g:3953:1: (lv_assmComponents_11_0= ruleCompInstance )
            // InternalDedalADL.g:3954:3: lv_assmComponents_11_0= ruleCompInstance
            {
             
            	        newCompositeNode(grammarAccess.getAssemblyAccess().getAssmComponentsCompInstanceParserRuleCall_8_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_7);
            lv_assmComponents_11_0=ruleCompInstance();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAssemblyRule());
            	        }
                   		add(
                   			current, 
                   			"assmComponents",
                    		lv_assmComponents_11_0, 
                    		"fr.ema.dedal.xtext.DedalADL.CompInstance");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:3970:2: (otherlv_12= ';' ( (lv_assmComponents_13_0= ruleCompInstance ) ) )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==15) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalDedalADL.g:3970:4: otherlv_12= ';' ( (lv_assmComponents_13_0= ruleCompInstance ) )
            	    {
            	    otherlv_12=(Token)match(input,15,FollowSets000.FOLLOW_102); 

            	        	newLeafNode(otherlv_12, grammarAccess.getAssemblyAccess().getSemicolonKeyword_9_0());
            	        
            	    // InternalDedalADL.g:3974:1: ( (lv_assmComponents_13_0= ruleCompInstance ) )
            	    // InternalDedalADL.g:3975:1: (lv_assmComponents_13_0= ruleCompInstance )
            	    {
            	    // InternalDedalADL.g:3975:1: (lv_assmComponents_13_0= ruleCompInstance )
            	    // InternalDedalADL.g:3976:3: lv_assmComponents_13_0= ruleCompInstance
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAssemblyAccess().getAssmComponentsCompInstanceParserRuleCall_9_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    lv_assmComponents_13_0=ruleCompInstance();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAssemblyRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"assmComponents",
            	            		lv_assmComponents_13_0, 
            	            		"fr.ema.dedal.xtext.DedalADL.CompInstance");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);

            otherlv_14=(Token)match(input,16,FollowSets000.FOLLOW_103); 

                	newLeafNode(otherlv_14, grammarAccess.getAssemblyAccess().getRightParenthesisKeyword_10());
                
            // InternalDedalADL.g:3996:1: (otherlv_15= 'assembly_constraints' otherlv_16= '(' ruleConstraint (otherlv_18= ';' ruleConstraint )* otherlv_20= ')' )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==80) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalDedalADL.g:3996:3: otherlv_15= 'assembly_constraints' otherlv_16= '(' ruleConstraint (otherlv_18= ';' ruleConstraint )* otherlv_20= ')'
                    {
                    otherlv_15=(Token)match(input,80,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_15, grammarAccess.getAssemblyAccess().getAssembly_constraintsKeyword_11_0());
                        
                    otherlv_16=(Token)match(input,14,FollowSets000.FOLLOW_104); 

                        	newLeafNode(otherlv_16, grammarAccess.getAssemblyAccess().getLeftParenthesisKeyword_11_1());
                        
                     
                            newCompositeNode(grammarAccess.getAssemblyAccess().getConstraintParserRuleCall_11_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_7);
                    ruleConstraint();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        
                    // InternalDedalADL.g:4012:1: (otherlv_18= ';' ruleConstraint )*
                    loop94:
                    do {
                        int alt94=2;
                        int LA94_0 = input.LA(1);

                        if ( (LA94_0==15) ) {
                            alt94=1;
                        }


                        switch (alt94) {
                    	case 1 :
                    	    // InternalDedalADL.g:4012:3: otherlv_18= ';' ruleConstraint
                    	    {
                    	    otherlv_18=(Token)match(input,15,FollowSets000.FOLLOW_104); 

                    	        	newLeafNode(otherlv_18, grammarAccess.getAssemblyAccess().getSemicolonKeyword_11_3_0());
                    	        
                    	     
                    	            newCompositeNode(grammarAccess.getAssemblyAccess().getConstraintParserRuleCall_11_3_1()); 
                    	        
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    ruleConstraint();

                    	    state._fsp--;

                    	     
                    	            afterParserOrEnumRuleCall();
                    	        

                    	    }
                    	    break;

                    	default :
                    	    break loop94;
                        }
                    } while (true);

                    otherlv_20=(Token)match(input,16,FollowSets000.FOLLOW_105); 

                        	newLeafNode(otherlv_20, grammarAccess.getAssemblyAccess().getRightParenthesisKeyword_11_4());
                        

                    }
                    break;

            }

            // InternalDedalADL.g:4028:3: (otherlv_21= 'pre_version' ruleversion )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==31) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalDedalADL.g:4028:5: otherlv_21= 'pre_version' ruleversion
                    {
                    otherlv_21=(Token)match(input,31,FollowSets000.FOLLOW_22); 

                        	newLeafNode(otherlv_21, grammarAccess.getAssemblyAccess().getPre_versionKeyword_12_0());
                        
                     
                            newCompositeNode(grammarAccess.getAssemblyAccess().getVersionParserRuleCall_12_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_106);
                    ruleversion();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // InternalDedalADL.g:4040:3: (otherlv_23= 'by' rulechange )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==32) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalDedalADL.g:4040:5: otherlv_23= 'by' rulechange
                    {
                    otherlv_23=(Token)match(input,32,FollowSets000.FOLLOW_32); 

                        	newLeafNode(otherlv_23, grammarAccess.getAssemblyAccess().getByKeyword_13_0());
                        
                     
                            newCompositeNode(grammarAccess.getAssemblyAccess().getChangeParserRuleCall_13_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_107);
                    rulechange();

                    state._fsp--;

                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }

            // InternalDedalADL.g:4052:3: (otherlv_25= 'interface_types' otherlv_26= '(' ( (lv_interfaceTypes_27_0= ruleInterfaceType ) ) (otherlv_28= ';' ( (lv_interfaceTypes_29_0= ruleInterfaceType ) ) )* otherlv_30= ')' )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==20) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalDedalADL.g:4052:5: otherlv_25= 'interface_types' otherlv_26= '(' ( (lv_interfaceTypes_27_0= ruleInterfaceType ) ) (otherlv_28= ';' ( (lv_interfaceTypes_29_0= ruleInterfaceType ) ) )* otherlv_30= ')'
                    {
                    otherlv_25=(Token)match(input,20,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_25, grammarAccess.getAssemblyAccess().getInterface_typesKeyword_14_0());
                        
                    otherlv_26=(Token)match(input,14,FollowSets000.FOLLOW_13); 

                        	newLeafNode(otherlv_26, grammarAccess.getAssemblyAccess().getLeftParenthesisKeyword_14_1());
                        
                    // InternalDedalADL.g:4060:1: ( (lv_interfaceTypes_27_0= ruleInterfaceType ) )
                    // InternalDedalADL.g:4061:1: (lv_interfaceTypes_27_0= ruleInterfaceType )
                    {
                    // InternalDedalADL.g:4061:1: (lv_interfaceTypes_27_0= ruleInterfaceType )
                    // InternalDedalADL.g:4062:3: lv_interfaceTypes_27_0= ruleInterfaceType
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssemblyAccess().getInterfaceTypesInterfaceTypeParserRuleCall_14_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_interfaceTypes_27_0=ruleInterfaceType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssemblyRule());
                    	        }
                           		add(
                           			current, 
                           			"interfaceTypes",
                            		lv_interfaceTypes_27_0, 
                            		"fr.ema.dedal.xtext.DedalADL.InterfaceType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:4078:2: (otherlv_28= ';' ( (lv_interfaceTypes_29_0= ruleInterfaceType ) ) )*
                    loop98:
                    do {
                        int alt98=2;
                        int LA98_0 = input.LA(1);

                        if ( (LA98_0==15) ) {
                            alt98=1;
                        }


                        switch (alt98) {
                    	case 1 :
                    	    // InternalDedalADL.g:4078:4: otherlv_28= ';' ( (lv_interfaceTypes_29_0= ruleInterfaceType ) )
                    	    {
                    	    otherlv_28=(Token)match(input,15,FollowSets000.FOLLOW_13); 

                    	        	newLeafNode(otherlv_28, grammarAccess.getAssemblyAccess().getSemicolonKeyword_14_3_0());
                    	        
                    	    // InternalDedalADL.g:4082:1: ( (lv_interfaceTypes_29_0= ruleInterfaceType ) )
                    	    // InternalDedalADL.g:4083:1: (lv_interfaceTypes_29_0= ruleInterfaceType )
                    	    {
                    	    // InternalDedalADL.g:4083:1: (lv_interfaceTypes_29_0= ruleInterfaceType )
                    	    // InternalDedalADL.g:4084:3: lv_interfaceTypes_29_0= ruleInterfaceType
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssemblyAccess().getInterfaceTypesInterfaceTypeParserRuleCall_14_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_interfaceTypes_29_0=ruleInterfaceType();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssemblyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"interfaceTypes",
                    	            		lv_interfaceTypes_29_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.InterfaceType");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop98;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,16,FollowSets000.FOLLOW_108); 

                        	newLeafNode(otherlv_30, grammarAccess.getAssemblyAccess().getRightParenthesisKeyword_14_4());
                        

                    }
                    break;

            }

            // InternalDedalADL.g:4104:3: (otherlv_31= 'assembly_connections' otherlv_32= '(' ( (lv_assemblyConnections_33_0= ruleInstConnection ) ) (otherlv_34= ';' ( (lv_assemblyConnections_35_0= ruleInstConnection ) ) )* otherlv_36= ')' )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==81) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalDedalADL.g:4104:5: otherlv_31= 'assembly_connections' otherlv_32= '(' ( (lv_assemblyConnections_33_0= ruleInstConnection ) ) (otherlv_34= ';' ( (lv_assemblyConnections_35_0= ruleInstConnection ) ) )* otherlv_36= ')'
                    {
                    otherlv_31=(Token)match(input,81,FollowSets000.FOLLOW_5); 

                        	newLeafNode(otherlv_31, grammarAccess.getAssemblyAccess().getAssembly_connectionsKeyword_15_0());
                        
                    otherlv_32=(Token)match(input,14,FollowSets000.FOLLOW_109); 

                        	newLeafNode(otherlv_32, grammarAccess.getAssemblyAccess().getLeftParenthesisKeyword_15_1());
                        
                    // InternalDedalADL.g:4112:1: ( (lv_assemblyConnections_33_0= ruleInstConnection ) )
                    // InternalDedalADL.g:4113:1: (lv_assemblyConnections_33_0= ruleInstConnection )
                    {
                    // InternalDedalADL.g:4113:1: (lv_assemblyConnections_33_0= ruleInstConnection )
                    // InternalDedalADL.g:4114:3: lv_assemblyConnections_33_0= ruleInstConnection
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssemblyAccess().getAssemblyConnectionsInstConnectionParserRuleCall_15_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_7);
                    lv_assemblyConnections_33_0=ruleInstConnection();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssemblyRule());
                    	        }
                           		add(
                           			current, 
                           			"assemblyConnections",
                            		lv_assemblyConnections_33_0, 
                            		"fr.ema.dedal.xtext.DedalADL.InstConnection");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:4130:2: (otherlv_34= ';' ( (lv_assemblyConnections_35_0= ruleInstConnection ) ) )*
                    loop100:
                    do {
                        int alt100=2;
                        int LA100_0 = input.LA(1);

                        if ( (LA100_0==15) ) {
                            alt100=1;
                        }


                        switch (alt100) {
                    	case 1 :
                    	    // InternalDedalADL.g:4130:4: otherlv_34= ';' ( (lv_assemblyConnections_35_0= ruleInstConnection ) )
                    	    {
                    	    otherlv_34=(Token)match(input,15,FollowSets000.FOLLOW_109); 

                    	        	newLeafNode(otherlv_34, grammarAccess.getAssemblyAccess().getSemicolonKeyword_15_3_0());
                    	        
                    	    // InternalDedalADL.g:4134:1: ( (lv_assemblyConnections_35_0= ruleInstConnection ) )
                    	    // InternalDedalADL.g:4135:1: (lv_assemblyConnections_35_0= ruleInstConnection )
                    	    {
                    	    // InternalDedalADL.g:4135:1: (lv_assemblyConnections_35_0= ruleInstConnection )
                    	    // InternalDedalADL.g:4136:3: lv_assemblyConnections_35_0= ruleInstConnection
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAssemblyAccess().getAssemblyConnectionsInstConnectionParserRuleCall_15_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_7);
                    	    lv_assemblyConnections_35_0=ruleInstConnection();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAssemblyRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"assemblyConnections",
                    	            		lv_assemblyConnections_35_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.InstConnection");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop100;
                        }
                    } while (true);

                    otherlv_36=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                        	newLeafNode(otherlv_36, grammarAccess.getAssemblyAccess().getRightParenthesisKeyword_15_4());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssembly"


    // $ANTLR start "entryRuleassembly_name"
    // InternalDedalADL.g:4164:1: entryRuleassembly_name returns [String current=null] : iv_ruleassembly_name= ruleassembly_name EOF ;
    public final String entryRuleassembly_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassembly_name = null;


        try {
            // InternalDedalADL.g:4165:2: (iv_ruleassembly_name= ruleassembly_name EOF )
            // InternalDedalADL.g:4166:2: iv_ruleassembly_name= ruleassembly_name EOF
            {
             newCompositeNode(grammarAccess.getAssembly_nameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleassembly_name=ruleassembly_name();

            state._fsp--;

             current =iv_ruleassembly_name.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleassembly_name"


    // $ANTLR start "ruleassembly_name"
    // InternalDedalADL.g:4173:1: ruleassembly_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleassembly_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:4176:28: (this_ID_0= RULE_ID )
            // InternalDedalADL.g:4177:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getAssembly_nameAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassembly_name"


    // $ANTLR start "entryRuleConstraint"
    // InternalDedalADL.g:4192:1: entryRuleConstraint returns [String current=null] : iv_ruleConstraint= ruleConstraint EOF ;
    public final String entryRuleConstraint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstraint = null;


        try {
            // InternalDedalADL.g:4193:2: (iv_ruleConstraint= ruleConstraint EOF )
            // InternalDedalADL.g:4194:2: iv_ruleConstraint= ruleConstraint EOF
            {
             newCompositeNode(grammarAccess.getConstraintRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConstraint=ruleConstraint();

            state._fsp--;

             current =iv_ruleConstraint.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstraint"


    // $ANTLR start "ruleConstraint"
    // InternalDedalADL.g:4201:1: ruleConstraint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'expression' this_constraint_expression_1= ruleconstraint_expression ) ;
    public final AntlrDatatypeRuleToken ruleConstraint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_constraint_expression_1 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:4204:28: ( (kw= 'expression' this_constraint_expression_1= ruleconstraint_expression ) )
            // InternalDedalADL.g:4205:1: (kw= 'expression' this_constraint_expression_1= ruleconstraint_expression )
            {
            // InternalDedalADL.g:4205:1: (kw= 'expression' this_constraint_expression_1= ruleconstraint_expression )
            // InternalDedalADL.g:4206:2: kw= 'expression' this_constraint_expression_1= ruleconstraint_expression
            {
            kw=(Token)match(input,82,FollowSets000.FOLLOW_110); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getConstraintAccess().getExpressionKeyword_0()); 
                
             
                    newCompositeNode(grammarAccess.getConstraintAccess().getConstraint_expressionParserRuleCall_1()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
            this_constraint_expression_1=ruleconstraint_expression();

            state._fsp--;


            		current.merge(this_constraint_expression_1);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstraint"


    // $ANTLR start "entryRuleCompInstance"
    // InternalDedalADL.g:4230:1: entryRuleCompInstance returns [EObject current=null] : iv_ruleCompInstance= ruleCompInstance EOF ;
    public final EObject entryRuleCompInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompInstance = null;


        try {
            // InternalDedalADL.g:4231:2: (iv_ruleCompInstance= ruleCompInstance EOF )
            // InternalDedalADL.g:4232:2: iv_ruleCompInstance= ruleCompInstance EOF
            {
             newCompositeNode(grammarAccess.getCompInstanceRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCompInstance=ruleCompInstance();

            state._fsp--;

             current =iv_ruleCompInstance; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompInstance"


    // $ANTLR start "ruleCompInstance"
    // InternalDedalADL.g:4239:1: ruleCompInstance returns [EObject current=null] : (otherlv_0= 'component_instance' ( (lv_name_1_0= rulecomponent_instance_name ) ) (otherlv_2= 'as' ( ( ruleEString ) ) )? otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) otherlv_6= 'instance_of' ( ( ruleEString ) ) (otherlv_8= 'component_interfaces' ( (lv_compInterfaces_9_0= ruleInteraction ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInteraction ) ) )* )? ) ;
    public final EObject ruleCompInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_id_5_0 = null;

        EObject lv_compInterfaces_9_0 = null;

        EObject lv_compInterfaces_11_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:4242:28: ( (otherlv_0= 'component_instance' ( (lv_name_1_0= rulecomponent_instance_name ) ) (otherlv_2= 'as' ( ( ruleEString ) ) )? otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) otherlv_6= 'instance_of' ( ( ruleEString ) ) (otherlv_8= 'component_interfaces' ( (lv_compInterfaces_9_0= ruleInteraction ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInteraction ) ) )* )? ) )
            // InternalDedalADL.g:4243:1: (otherlv_0= 'component_instance' ( (lv_name_1_0= rulecomponent_instance_name ) ) (otherlv_2= 'as' ( ( ruleEString ) ) )? otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) otherlv_6= 'instance_of' ( ( ruleEString ) ) (otherlv_8= 'component_interfaces' ( (lv_compInterfaces_9_0= ruleInteraction ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInteraction ) ) )* )? )
            {
            // InternalDedalADL.g:4243:1: (otherlv_0= 'component_instance' ( (lv_name_1_0= rulecomponent_instance_name ) ) (otherlv_2= 'as' ( ( ruleEString ) ) )? otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) otherlv_6= 'instance_of' ( ( ruleEString ) ) (otherlv_8= 'component_interfaces' ( (lv_compInterfaces_9_0= ruleInteraction ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInteraction ) ) )* )? )
            // InternalDedalADL.g:4243:3: otherlv_0= 'component_instance' ( (lv_name_1_0= rulecomponent_instance_name ) ) (otherlv_2= 'as' ( ( ruleEString ) ) )? otherlv_4= 'id' ( (lv_id_5_0= ruleEString ) ) otherlv_6= 'instance_of' ( ( ruleEString ) ) (otherlv_8= 'component_interfaces' ( (lv_compInterfaces_9_0= ruleInteraction ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInteraction ) ) )* )?
            {
            otherlv_0=(Token)match(input,83,FollowSets000.FOLLOW_110); 

                	newLeafNode(otherlv_0, grammarAccess.getCompInstanceAccess().getComponent_instanceKeyword_0());
                
            // InternalDedalADL.g:4247:1: ( (lv_name_1_0= rulecomponent_instance_name ) )
            // InternalDedalADL.g:4248:1: (lv_name_1_0= rulecomponent_instance_name )
            {
            // InternalDedalADL.g:4248:1: (lv_name_1_0= rulecomponent_instance_name )
            // InternalDedalADL.g:4249:3: lv_name_1_0= rulecomponent_instance_name
            {
             
            	        newCompositeNode(grammarAccess.getCompInstanceAccess().getNameComponent_instance_nameParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_69);
            lv_name_1_0=rulecomponent_instance_name();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompInstanceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.component_instance_name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:4265:2: (otherlv_2= 'as' ( ( ruleEString ) ) )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==53) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalDedalADL.g:4265:4: otherlv_2= 'as' ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,53,FollowSets000.FOLLOW_3); 

                        	newLeafNode(otherlv_2, grammarAccess.getCompInstanceAccess().getAsKeyword_2_0());
                        
                    // InternalDedalADL.g:4269:1: ( ( ruleEString ) )
                    // InternalDedalADL.g:4270:1: ( ruleEString )
                    {
                    // InternalDedalADL.g:4270:1: ( ruleEString )
                    // InternalDedalADL.g:4271:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCompInstanceRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCompInstanceAccess().getRoleCompRoleCrossReference_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_34);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,34,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getCompInstanceAccess().getIdKeyword_3());
                
            // InternalDedalADL.g:4288:1: ( (lv_id_5_0= ruleEString ) )
            // InternalDedalADL.g:4289:1: (lv_id_5_0= ruleEString )
            {
            // InternalDedalADL.g:4289:1: (lv_id_5_0= ruleEString )
            // InternalDedalADL.g:4290:3: lv_id_5_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getCompInstanceAccess().getIdEStringParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_98);
            lv_id_5_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getCompInstanceRule());
            	        }
                   		set(
                   			current, 
                   			"id",
                    		lv_id_5_0, 
                    		"fr.ema.dedal.xtext.DedalADL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,78,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_6, grammarAccess.getCompInstanceAccess().getInstance_ofKeyword_5());
                
            // InternalDedalADL.g:4310:1: ( ( ruleEString ) )
            // InternalDedalADL.g:4311:1: ( ruleEString )
            {
            // InternalDedalADL.g:4311:1: ( ruleEString )
            // InternalDedalADL.g:4312:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCompInstanceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getCompInstanceAccess().getInstantiatesCompClassCrossReference_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_111);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // InternalDedalADL.g:4325:2: (otherlv_8= 'component_interfaces' ( (lv_compInterfaces_9_0= ruleInteraction ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInteraction ) ) )* )?
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==84) ) {
                alt104=1;
            }
            switch (alt104) {
                case 1 :
                    // InternalDedalADL.g:4325:4: otherlv_8= 'component_interfaces' ( (lv_compInterfaces_9_0= ruleInteraction ) ) (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInteraction ) ) )*
                    {
                    otherlv_8=(Token)match(input,84,FollowSets000.FOLLOW_42); 

                        	newLeafNode(otherlv_8, grammarAccess.getCompInstanceAccess().getComponent_interfacesKeyword_7_0());
                        
                    // InternalDedalADL.g:4329:1: ( (lv_compInterfaces_9_0= ruleInteraction ) )
                    // InternalDedalADL.g:4330:1: (lv_compInterfaces_9_0= ruleInteraction )
                    {
                    // InternalDedalADL.g:4330:1: (lv_compInterfaces_9_0= ruleInteraction )
                    // InternalDedalADL.g:4331:3: lv_compInterfaces_9_0= ruleInteraction
                    {
                     
                    	        newCompositeNode(grammarAccess.getCompInstanceAccess().getCompInterfacesInteractionParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_33);
                    lv_compInterfaces_9_0=ruleInteraction();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCompInstanceRule());
                    	        }
                           		add(
                           			current, 
                           			"compInterfaces",
                            		lv_compInterfaces_9_0, 
                            		"fr.ema.dedal.xtext.DedalADL.Interaction");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // InternalDedalADL.g:4347:2: (otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInteraction ) ) )*
                    loop103:
                    do {
                        int alt103=2;
                        int LA103_0 = input.LA(1);

                        if ( (LA103_0==15) ) {
                            int LA103_2 = input.LA(2);

                            if ( (LA103_2==40||LA103_2==73||LA103_2==75) ) {
                                alt103=1;
                            }


                        }


                        switch (alt103) {
                    	case 1 :
                    	    // InternalDedalADL.g:4347:4: otherlv_10= ';' ( (lv_compInterfaces_11_0= ruleInteraction ) )
                    	    {
                    	    otherlv_10=(Token)match(input,15,FollowSets000.FOLLOW_42); 

                    	        	newLeafNode(otherlv_10, grammarAccess.getCompInstanceAccess().getSemicolonKeyword_7_2_0());
                    	        
                    	    // InternalDedalADL.g:4351:1: ( (lv_compInterfaces_11_0= ruleInteraction ) )
                    	    // InternalDedalADL.g:4352:1: (lv_compInterfaces_11_0= ruleInteraction )
                    	    {
                    	    // InternalDedalADL.g:4352:1: (lv_compInterfaces_11_0= ruleInteraction )
                    	    // InternalDedalADL.g:4353:3: lv_compInterfaces_11_0= ruleInteraction
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getCompInstanceAccess().getCompInterfacesInteractionParserRuleCall_7_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_33);
                    	    lv_compInterfaces_11_0=ruleInteraction();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getCompInstanceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"compInterfaces",
                    	            		lv_compInterfaces_11_0, 
                    	            		"fr.ema.dedal.xtext.DedalADL.Interaction");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop103;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompInstance"


    // $ANTLR start "entryRulecomponent_instance_name"
    // InternalDedalADL.g:4377:1: entryRulecomponent_instance_name returns [String current=null] : iv_rulecomponent_instance_name= rulecomponent_instance_name EOF ;
    public final String entryRulecomponent_instance_name() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulecomponent_instance_name = null;


        try {
            // InternalDedalADL.g:4378:2: (iv_rulecomponent_instance_name= rulecomponent_instance_name EOF )
            // InternalDedalADL.g:4379:2: iv_rulecomponent_instance_name= rulecomponent_instance_name EOF
            {
             newCompositeNode(grammarAccess.getComponent_instance_nameRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulecomponent_instance_name=rulecomponent_instance_name();

            state._fsp--;

             current =iv_rulecomponent_instance_name.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulecomponent_instance_name"


    // $ANTLR start "rulecomponent_instance_name"
    // InternalDedalADL.g:4386:1: rulecomponent_instance_name returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken rulecomponent_instance_name() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:4389:28: (this_ID_0= RULE_ID )
            // InternalDedalADL.g:4390:5: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_2); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getComponent_instance_nameAccess().getIDTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecomponent_instance_name"


    // $ANTLR start "entryRuleInstConnection"
    // InternalDedalADL.g:4405:1: entryRuleInstConnection returns [EObject current=null] : iv_ruleInstConnection= ruleInstConnection EOF ;
    public final EObject entryRuleInstConnection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstConnection = null;


        try {
            // InternalDedalADL.g:4406:2: (iv_ruleInstConnection= ruleInstConnection EOF )
            // InternalDedalADL.g:4407:2: iv_ruleInstConnection= ruleInstConnection EOF
            {
             newCompositeNode(grammarAccess.getInstConnectionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInstConnection=ruleInstConnection();

            state._fsp--;

             current =iv_ruleInstConnection; 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstConnection"


    // $ANTLR start "ruleInstConnection"
    // InternalDedalADL.g:4414:1: ruleInstConnection returns [EObject current=null] : (otherlv_0= 'instance_connection' ( (lv_refID_1_0= ruleEString ) ) otherlv_2= 'client' ( ( ruleEString ) ) otherlv_4= '.' ( ( ruleEString ) ) otherlv_6= 'server' ( ( ruleEString ) ) otherlv_8= '.' ( ( ruleEString ) ) ) ;
    public final EObject ruleInstConnection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_refID_1_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:4417:28: ( (otherlv_0= 'instance_connection' ( (lv_refID_1_0= ruleEString ) ) otherlv_2= 'client' ( ( ruleEString ) ) otherlv_4= '.' ( ( ruleEString ) ) otherlv_6= 'server' ( ( ruleEString ) ) otherlv_8= '.' ( ( ruleEString ) ) ) )
            // InternalDedalADL.g:4418:1: (otherlv_0= 'instance_connection' ( (lv_refID_1_0= ruleEString ) ) otherlv_2= 'client' ( ( ruleEString ) ) otherlv_4= '.' ( ( ruleEString ) ) otherlv_6= 'server' ( ( ruleEString ) ) otherlv_8= '.' ( ( ruleEString ) ) )
            {
            // InternalDedalADL.g:4418:1: (otherlv_0= 'instance_connection' ( (lv_refID_1_0= ruleEString ) ) otherlv_2= 'client' ( ( ruleEString ) ) otherlv_4= '.' ( ( ruleEString ) ) otherlv_6= 'server' ( ( ruleEString ) ) otherlv_8= '.' ( ( ruleEString ) ) )
            // InternalDedalADL.g:4418:3: otherlv_0= 'instance_connection' ( (lv_refID_1_0= ruleEString ) ) otherlv_2= 'client' ( ( ruleEString ) ) otherlv_4= '.' ( ( ruleEString ) ) otherlv_6= 'server' ( ( ruleEString ) ) otherlv_8= '.' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,85,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_0, grammarAccess.getInstConnectionAccess().getInstance_connectionKeyword_0());
                
            // InternalDedalADL.g:4422:1: ( (lv_refID_1_0= ruleEString ) )
            // InternalDedalADL.g:4423:1: (lv_refID_1_0= ruleEString )
            {
            // InternalDedalADL.g:4423:1: (lv_refID_1_0= ruleEString )
            // InternalDedalADL.g:4424:3: lv_refID_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getInstConnectionAccess().getRefIDEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_48);
            lv_refID_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getInstConnectionRule());
            	        }
                   		set(
                   			current, 
                   			"refID",
                    		lv_refID_1_0, 
                    		"fr.ema.dedal.xtext.DedalADL.EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,46,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_2, grammarAccess.getInstConnectionAccess().getClientKeyword_2());
                
            // InternalDedalADL.g:4444:1: ( ( ruleEString ) )
            // InternalDedalADL.g:4445:1: ( ruleEString )
            {
            // InternalDedalADL.g:4445:1: ( ruleEString )
            // InternalDedalADL.g:4446:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInstConnectionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInstConnectionAccess().getClientInstElemCompInstanceCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_49);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,47,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_4, grammarAccess.getInstConnectionAccess().getFullStopKeyword_4());
                
            // InternalDedalADL.g:4463:1: ( ( ruleEString ) )
            // InternalDedalADL.g:4464:1: ( ruleEString )
            {
            // InternalDedalADL.g:4464:1: ( ruleEString )
            // InternalDedalADL.g:4465:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInstConnectionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInstConnectionAccess().getClientIntElemInteractionCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_50);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_6=(Token)match(input,48,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_6, grammarAccess.getInstConnectionAccess().getServerKeyword_6());
                
            // InternalDedalADL.g:4482:1: ( ( ruleEString ) )
            // InternalDedalADL.g:4483:1: ( ruleEString )
            {
            // InternalDedalADL.g:4483:1: ( ruleEString )
            // InternalDedalADL.g:4484:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInstConnectionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInstConnectionAccess().getServerInstElemCompInstanceCrossReference_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_49);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_8=(Token)match(input,47,FollowSets000.FOLLOW_3); 

                	newLeafNode(otherlv_8, grammarAccess.getInstConnectionAccess().getFullStopKeyword_8());
                
            // InternalDedalADL.g:4501:1: ( ( ruleEString ) )
            // InternalDedalADL.g:4502:1: ( ruleEString )
            {
            // InternalDedalADL.g:4502:1: ( ruleEString )
            // InternalDedalADL.g:4503:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getInstConnectionRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getInstConnectionAccess().getServerIntElemInteractionCrossReference_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstConnection"


    // $ANTLR start "entryRuleconstraint_expression"
    // InternalDedalADL.g:4524:1: entryRuleconstraint_expression returns [String current=null] : iv_ruleconstraint_expression= ruleconstraint_expression EOF ;
    public final String entryRuleconstraint_expression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconstraint_expression = null;


        try {
            // InternalDedalADL.g:4525:2: (iv_ruleconstraint_expression= ruleconstraint_expression EOF )
            // InternalDedalADL.g:4526:2: iv_ruleconstraint_expression= ruleconstraint_expression EOF
            {
             newCompositeNode(grammarAccess.getConstraint_expressionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleconstraint_expression=ruleconstraint_expression();

            state._fsp--;

             current =iv_ruleconstraint_expression.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconstraint_expression"


    // $ANTLR start "ruleconstraint_expression"
    // InternalDedalADL.g:4533:1: ruleconstraint_expression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '!' this_constraint_expression_1= ruleconstraint_expression this_logical_constraint_2= rulelogical_constraint ) | (this_relational_constraint_3= rulerelational_constraint this_logical_constraint_4= rulelogical_constraint ) ) ;
    public final AntlrDatatypeRuleToken ruleconstraint_expression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_constraint_expression_1 = null;

        AntlrDatatypeRuleToken this_logical_constraint_2 = null;

        AntlrDatatypeRuleToken this_relational_constraint_3 = null;

        AntlrDatatypeRuleToken this_logical_constraint_4 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:4536:28: ( ( (kw= '!' this_constraint_expression_1= ruleconstraint_expression this_logical_constraint_2= rulelogical_constraint ) | (this_relational_constraint_3= rulerelational_constraint this_logical_constraint_4= rulelogical_constraint ) ) )
            // InternalDedalADL.g:4537:1: ( (kw= '!' this_constraint_expression_1= ruleconstraint_expression this_logical_constraint_2= rulelogical_constraint ) | (this_relational_constraint_3= rulerelational_constraint this_logical_constraint_4= rulelogical_constraint ) )
            {
            // InternalDedalADL.g:4537:1: ( (kw= '!' this_constraint_expression_1= ruleconstraint_expression this_logical_constraint_2= rulelogical_constraint ) | (this_relational_constraint_3= rulerelational_constraint this_logical_constraint_4= rulelogical_constraint ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==86) ) {
                alt105=1;
            }
            else if ( (LA105_0==RULE_ID) ) {
                alt105=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // InternalDedalADL.g:4537:2: (kw= '!' this_constraint_expression_1= ruleconstraint_expression this_logical_constraint_2= rulelogical_constraint )
                    {
                    // InternalDedalADL.g:4537:2: (kw= '!' this_constraint_expression_1= ruleconstraint_expression this_logical_constraint_2= rulelogical_constraint )
                    // InternalDedalADL.g:4538:2: kw= '!' this_constraint_expression_1= ruleconstraint_expression this_logical_constraint_2= rulelogical_constraint
                    {
                    kw=(Token)match(input,86,FollowSets000.FOLLOW_110); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConstraint_expressionAccess().getExclamationMarkKeyword_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getConstraint_expressionAccess().getConstraint_expressionParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_112);
                    this_constraint_expression_1=ruleconstraint_expression();

                    state._fsp--;


                    		current.merge(this_constraint_expression_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getConstraint_expressionAccess().getLogical_constraintParserRuleCall_0_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_logical_constraint_2=rulelogical_constraint();

                    state._fsp--;


                    		current.merge(this_logical_constraint_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:4566:6: (this_relational_constraint_3= rulerelational_constraint this_logical_constraint_4= rulelogical_constraint )
                    {
                    // InternalDedalADL.g:4566:6: (this_relational_constraint_3= rulerelational_constraint this_logical_constraint_4= rulelogical_constraint )
                    // InternalDedalADL.g:4567:5: this_relational_constraint_3= rulerelational_constraint this_logical_constraint_4= rulelogical_constraint
                    {
                     
                            newCompositeNode(grammarAccess.getConstraint_expressionAccess().getRelational_constraintParserRuleCall_1_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_112);
                    this_relational_constraint_3=rulerelational_constraint();

                    state._fsp--;


                    		current.merge(this_relational_constraint_3);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getConstraint_expressionAccess().getLogical_constraintParserRuleCall_1_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_logical_constraint_4=rulelogical_constraint();

                    state._fsp--;


                    		current.merge(this_logical_constraint_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconstraint_expression"


    // $ANTLR start "entryRulelogical_constraint"
    // InternalDedalADL.g:4596:1: entryRulelogical_constraint returns [String current=null] : iv_rulelogical_constraint= rulelogical_constraint EOF ;
    public final String entryRulelogical_constraint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulelogical_constraint = null;


        try {
            // InternalDedalADL.g:4597:2: (iv_rulelogical_constraint= rulelogical_constraint EOF )
            // InternalDedalADL.g:4598:2: iv_rulelogical_constraint= rulelogical_constraint EOF
            {
             newCompositeNode(grammarAccess.getLogical_constraintRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulelogical_constraint=rulelogical_constraint();

            state._fsp--;

             current =iv_rulelogical_constraint.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulelogical_constraint"


    // $ANTLR start "rulelogical_constraint"
    // InternalDedalADL.g:4605:1: rulelogical_constraint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '||' this_constraint_expression_1= ruleconstraint_expression this_logical_constraint_2= rulelogical_constraint ) | (kw= '&&' this_constraint_expression_4= ruleconstraint_expression this_logical_constraint_5= rulelogical_constraint ) )? ;
    public final AntlrDatatypeRuleToken rulelogical_constraint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_constraint_expression_1 = null;

        AntlrDatatypeRuleToken this_logical_constraint_2 = null;

        AntlrDatatypeRuleToken this_constraint_expression_4 = null;

        AntlrDatatypeRuleToken this_logical_constraint_5 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:4608:28: ( ( (kw= '||' this_constraint_expression_1= ruleconstraint_expression this_logical_constraint_2= rulelogical_constraint ) | (kw= '&&' this_constraint_expression_4= ruleconstraint_expression this_logical_constraint_5= rulelogical_constraint ) )? )
            // InternalDedalADL.g:4609:1: ( (kw= '||' this_constraint_expression_1= ruleconstraint_expression this_logical_constraint_2= rulelogical_constraint ) | (kw= '&&' this_constraint_expression_4= ruleconstraint_expression this_logical_constraint_5= rulelogical_constraint ) )?
            {
            // InternalDedalADL.g:4609:1: ( (kw= '||' this_constraint_expression_1= ruleconstraint_expression this_logical_constraint_2= rulelogical_constraint ) | (kw= '&&' this_constraint_expression_4= ruleconstraint_expression this_logical_constraint_5= rulelogical_constraint ) )?
            int alt106=3;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==87) ) {
                alt106=1;
            }
            else if ( (LA106_0==88) ) {
                alt106=2;
            }
            switch (alt106) {
                case 1 :
                    // InternalDedalADL.g:4609:2: (kw= '||' this_constraint_expression_1= ruleconstraint_expression this_logical_constraint_2= rulelogical_constraint )
                    {
                    // InternalDedalADL.g:4609:2: (kw= '||' this_constraint_expression_1= ruleconstraint_expression this_logical_constraint_2= rulelogical_constraint )
                    // InternalDedalADL.g:4610:2: kw= '||' this_constraint_expression_1= ruleconstraint_expression this_logical_constraint_2= rulelogical_constraint
                    {
                    kw=(Token)match(input,87,FollowSets000.FOLLOW_110); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLogical_constraintAccess().getVerticalLineVerticalLineKeyword_0_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getLogical_constraintAccess().getConstraint_expressionParserRuleCall_0_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_112);
                    this_constraint_expression_1=ruleconstraint_expression();

                    state._fsp--;


                    		current.merge(this_constraint_expression_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getLogical_constraintAccess().getLogical_constraintParserRuleCall_0_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_logical_constraint_2=rulelogical_constraint();

                    state._fsp--;


                    		current.merge(this_logical_constraint_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:4638:6: (kw= '&&' this_constraint_expression_4= ruleconstraint_expression this_logical_constraint_5= rulelogical_constraint )
                    {
                    // InternalDedalADL.g:4638:6: (kw= '&&' this_constraint_expression_4= ruleconstraint_expression this_logical_constraint_5= rulelogical_constraint )
                    // InternalDedalADL.g:4639:2: kw= '&&' this_constraint_expression_4= ruleconstraint_expression this_logical_constraint_5= rulelogical_constraint
                    {
                    kw=(Token)match(input,88,FollowSets000.FOLLOW_110); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLogical_constraintAccess().getAmpersandAmpersandKeyword_1_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getLogical_constraintAccess().getConstraint_expressionParserRuleCall_1_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_112);
                    this_constraint_expression_4=ruleconstraint_expression();

                    state._fsp--;


                    		current.merge(this_constraint_expression_4);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                     
                            newCompositeNode(grammarAccess.getLogical_constraintAccess().getLogical_constraintParserRuleCall_1_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_logical_constraint_5=rulelogical_constraint();

                    state._fsp--;


                    		current.merge(this_logical_constraint_5);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulelogical_constraint"


    // $ANTLR start "entryRulerelational_constraint"
    // InternalDedalADL.g:4674:1: entryRulerelational_constraint returns [String current=null] : iv_rulerelational_constraint= rulerelational_constraint EOF ;
    public final String entryRulerelational_constraint() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulerelational_constraint = null;


        try {
            // InternalDedalADL.g:4675:2: (iv_rulerelational_constraint= rulerelational_constraint EOF )
            // InternalDedalADL.g:4676:2: iv_rulerelational_constraint= rulerelational_constraint EOF
            {
             newCompositeNode(grammarAccess.getRelational_constraintRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulerelational_constraint=rulerelational_constraint();

            state._fsp--;

             current =iv_rulerelational_constraint.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulerelational_constraint"


    // $ANTLR start "rulerelational_constraint"
    // InternalDedalADL.g:4683:1: rulerelational_constraint returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_instance_attribute_0= ruleinstance_attribute (kw= '==' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) (this_instance_attribute_7= ruleinstance_attribute | this_attribute_value_8= ruleattribute_value ) ) ;
    public final AntlrDatatypeRuleToken rulerelational_constraint() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_instance_attribute_0 = null;

        AntlrDatatypeRuleToken this_instance_attribute_7 = null;

        AntlrDatatypeRuleToken this_attribute_value_8 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:4686:28: ( (this_instance_attribute_0= ruleinstance_attribute (kw= '==' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) (this_instance_attribute_7= ruleinstance_attribute | this_attribute_value_8= ruleattribute_value ) ) )
            // InternalDedalADL.g:4687:1: (this_instance_attribute_0= ruleinstance_attribute (kw= '==' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) (this_instance_attribute_7= ruleinstance_attribute | this_attribute_value_8= ruleattribute_value ) )
            {
            // InternalDedalADL.g:4687:1: (this_instance_attribute_0= ruleinstance_attribute (kw= '==' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) (this_instance_attribute_7= ruleinstance_attribute | this_attribute_value_8= ruleattribute_value ) )
            // InternalDedalADL.g:4688:5: this_instance_attribute_0= ruleinstance_attribute (kw= '==' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' ) (this_instance_attribute_7= ruleinstance_attribute | this_attribute_value_8= ruleattribute_value )
            {
             
                    newCompositeNode(grammarAccess.getRelational_constraintAccess().getInstance_attributeParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_113);
            this_instance_attribute_0=ruleinstance_attribute();

            state._fsp--;


            		current.merge(this_instance_attribute_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalDedalADL.g:4698:1: (kw= '==' | kw= '!=' | kw= '>' | kw= '<' | kw= '>=' | kw= '<=' )
            int alt107=6;
            switch ( input.LA(1) ) {
            case 89:
                {
                alt107=1;
                }
                break;
            case 90:
                {
                alt107=2;
                }
                break;
            case 91:
                {
                alt107=3;
                }
                break;
            case 92:
                {
                alt107=4;
                }
                break;
            case 93:
                {
                alt107=5;
                }
                break;
            case 94:
                {
                alt107=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // InternalDedalADL.g:4699:2: kw= '=='
                    {
                    kw=(Token)match(input,89,FollowSets000.FOLLOW_110); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelational_constraintAccess().getEqualsSignEqualsSignKeyword_1_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:4706:2: kw= '!='
                    {
                    kw=(Token)match(input,90,FollowSets000.FOLLOW_110); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelational_constraintAccess().getExclamationMarkEqualsSignKeyword_1_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalDedalADL.g:4713:2: kw= '>'
                    {
                    kw=(Token)match(input,91,FollowSets000.FOLLOW_110); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelational_constraintAccess().getGreaterThanSignKeyword_1_2()); 
                        

                    }
                    break;
                case 4 :
                    // InternalDedalADL.g:4720:2: kw= '<'
                    {
                    kw=(Token)match(input,92,FollowSets000.FOLLOW_110); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelational_constraintAccess().getLessThanSignKeyword_1_3()); 
                        

                    }
                    break;
                case 5 :
                    // InternalDedalADL.g:4727:2: kw= '>='
                    {
                    kw=(Token)match(input,93,FollowSets000.FOLLOW_110); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelational_constraintAccess().getGreaterThanSignEqualsSignKeyword_1_4()); 
                        

                    }
                    break;
                case 6 :
                    // InternalDedalADL.g:4734:2: kw= '<='
                    {
                    kw=(Token)match(input,94,FollowSets000.FOLLOW_110); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getRelational_constraintAccess().getLessThanSignEqualsSignKeyword_1_5()); 
                        

                    }
                    break;

            }

            // InternalDedalADL.g:4739:2: (this_instance_attribute_7= ruleinstance_attribute | this_attribute_value_8= ruleattribute_value )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==RULE_ID) ) {
                int LA108_1 = input.LA(2);

                if ( (LA108_1==95) ) {
                    alt108=2;
                }
                else if ( (LA108_1==47) ) {
                    alt108=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 108, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }
            switch (alt108) {
                case 1 :
                    // InternalDedalADL.g:4740:5: this_instance_attribute_7= ruleinstance_attribute
                    {
                     
                            newCompositeNode(grammarAccess.getRelational_constraintAccess().getInstance_attributeParserRuleCall_2_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_instance_attribute_7=ruleinstance_attribute();

                    state._fsp--;


                    		current.merge(this_instance_attribute_7);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:4752:5: this_attribute_value_8= ruleattribute_value
                    {
                     
                            newCompositeNode(grammarAccess.getRelational_constraintAccess().getAttribute_valueParserRuleCall_2_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_attribute_value_8=ruleattribute_value();

                    state._fsp--;


                    		current.merge(this_attribute_value_8);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulerelational_constraint"


    // $ANTLR start "entryRuleinstance_attribute"
    // InternalDedalADL.g:4770:1: entryRuleinstance_attribute returns [String current=null] : iv_ruleinstance_attribute= ruleinstance_attribute EOF ;
    public final String entryRuleinstance_attribute() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinstance_attribute = null;


        try {
            // InternalDedalADL.g:4771:2: (iv_ruleinstance_attribute= ruleinstance_attribute EOF )
            // InternalDedalADL.g:4772:2: iv_ruleinstance_attribute= ruleinstance_attribute EOF
            {
             newCompositeNode(grammarAccess.getInstance_attributeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleinstance_attribute=ruleinstance_attribute();

            state._fsp--;

             current =iv_ruleinstance_attribute.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinstance_attribute"


    // $ANTLR start "ruleinstance_attribute"
    // InternalDedalADL.g:4779:1: ruleinstance_attribute returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_component_instance_name_0= rulecomponent_instance_name kw= '.' this_attribute_name_2= ruleattribute_name ) ;
    public final AntlrDatatypeRuleToken ruleinstance_attribute() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_component_instance_name_0 = null;

        AntlrDatatypeRuleToken this_attribute_name_2 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:4782:28: ( (this_component_instance_name_0= rulecomponent_instance_name kw= '.' this_attribute_name_2= ruleattribute_name ) )
            // InternalDedalADL.g:4783:1: (this_component_instance_name_0= rulecomponent_instance_name kw= '.' this_attribute_name_2= ruleattribute_name )
            {
            // InternalDedalADL.g:4783:1: (this_component_instance_name_0= rulecomponent_instance_name kw= '.' this_attribute_name_2= ruleattribute_name )
            // InternalDedalADL.g:4784:5: this_component_instance_name_0= rulecomponent_instance_name kw= '.' this_attribute_name_2= ruleattribute_name
            {
             
                    newCompositeNode(grammarAccess.getInstance_attributeAccess().getComponent_instance_nameParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_49);
            this_component_instance_name_0=rulecomponent_instance_name();

            state._fsp--;


            		current.merge(this_component_instance_name_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,47,FollowSets000.FOLLOW_22); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getInstance_attributeAccess().getFullStopKeyword_1()); 
                
             
                    newCompositeNode(grammarAccess.getInstance_attributeAccess().getAttribute_nameParserRuleCall_2()); 
                
            pushFollow(FollowSets000.FOLLOW_2);
            this_attribute_name_2=ruleattribute_name();

            state._fsp--;


            		current.merge(this_attribute_name_2);
                
             
                    afterParserOrEnumRuleCall();
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinstance_attribute"


    // $ANTLR start "entryRuleattribute_value"
    // InternalDedalADL.g:4819:1: entryRuleattribute_value returns [String current=null] : iv_ruleattribute_value= ruleattribute_value EOF ;
    public final String entryRuleattribute_value() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleattribute_value = null;


        try {
            // InternalDedalADL.g:4820:2: (iv_ruleattribute_value= ruleattribute_value EOF )
            // InternalDedalADL.g:4821:2: iv_ruleattribute_value= ruleattribute_value EOF
            {
             newCompositeNode(grammarAccess.getAttribute_valueRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleattribute_value=ruleattribute_value();

            state._fsp--;

             current =iv_ruleattribute_value.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleattribute_value"


    // $ANTLR start "ruleattribute_value"
    // InternalDedalADL.g:4828:1: ruleattribute_value returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_attribute_name_0= ruleattribute_name kw= '=' ) ;
    public final AntlrDatatypeRuleToken ruleattribute_value() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_attribute_name_0 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:4831:28: ( (this_attribute_name_0= ruleattribute_name kw= '=' ) )
            // InternalDedalADL.g:4832:1: (this_attribute_name_0= ruleattribute_name kw= '=' )
            {
            // InternalDedalADL.g:4832:1: (this_attribute_name_0= ruleattribute_name kw= '=' )
            // InternalDedalADL.g:4833:5: this_attribute_name_0= ruleattribute_name kw= '='
            {
             
                    newCompositeNode(grammarAccess.getAttribute_valueAccess().getAttribute_nameParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_114);
            this_attribute_name_0=ruleattribute_name();

            state._fsp--;


            		current.merge(this_attribute_name_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,95,FollowSets000.FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getAttribute_valueAccess().getEqualsSignKeyword_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleattribute_value"


    // $ANTLR start "entryRuleversion"
    // InternalDedalADL.g:4857:1: entryRuleversion returns [String current=null] : iv_ruleversion= ruleversion EOF ;
    public final String entryRuleversion() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleversion = null;


        try {
            // InternalDedalADL.g:4858:2: (iv_ruleversion= ruleversion EOF )
            // InternalDedalADL.g:4859:2: iv_ruleversion= ruleversion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleversion=ruleversion();

            state._fsp--;

             current =iv_ruleversion.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleversion"


    // $ANTLR start "ruleversion"
    // InternalDedalADL.g:4866:1: ruleversion returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= '(' this_REVISION_NUMB_2= RULE_REVISION_NUMB kw= ')' ) ;
    public final AntlrDatatypeRuleToken ruleversion() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_REVISION_NUMB_2=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:4869:28: ( (this_ID_0= RULE_ID kw= '(' this_REVISION_NUMB_2= RULE_REVISION_NUMB kw= ')' ) )
            // InternalDedalADL.g:4870:1: (this_ID_0= RULE_ID kw= '(' this_REVISION_NUMB_2= RULE_REVISION_NUMB kw= ')' )
            {
            // InternalDedalADL.g:4870:1: (this_ID_0= RULE_ID kw= '(' this_REVISION_NUMB_2= RULE_REVISION_NUMB kw= ')' )
            // InternalDedalADL.g:4870:6: this_ID_0= RULE_ID kw= '(' this_REVISION_NUMB_2= RULE_REVISION_NUMB kw= ')'
            {
            this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getVersionAccess().getIDTerminalRuleCall_0()); 
                
            kw=(Token)match(input,14,FollowSets000.FOLLOW_28); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVersionAccess().getLeftParenthesisKeyword_1()); 
                
            this_REVISION_NUMB_2=(Token)match(input,RULE_REVISION_NUMB,FollowSets000.FOLLOW_53); 

            		current.merge(this_REVISION_NUMB_2);
                
             
                newLeafNode(this_REVISION_NUMB_2, grammarAccess.getVersionAccess().getREVISION_NUMBTerminalRuleCall_2()); 
                
            kw=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVersionAccess().getRightParenthesisKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleversion"


    // $ANTLR start "entryRulepre_version"
    // InternalDedalADL.g:4904:1: entryRulepre_version returns [String current=null] : iv_rulepre_version= rulepre_version EOF ;
    public final String entryRulepre_version() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulepre_version = null;


        try {
            // InternalDedalADL.g:4905:2: (iv_rulepre_version= rulepre_version EOF )
            // InternalDedalADL.g:4906:2: iv_rulepre_version= rulepre_version EOF
            {
             newCompositeNode(grammarAccess.getPre_versionRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulepre_version=rulepre_version();

            state._fsp--;

             current =iv_rulepre_version.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepre_version"


    // $ANTLR start "rulepre_version"
    // InternalDedalADL.g:4913:1: rulepre_version returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID )? kw= '(' this_REVISION_NUMB_2= RULE_REVISION_NUMB kw= ')' ) ;
    public final AntlrDatatypeRuleToken rulepre_version() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_REVISION_NUMB_2=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:4916:28: ( ( (this_ID_0= RULE_ID )? kw= '(' this_REVISION_NUMB_2= RULE_REVISION_NUMB kw= ')' ) )
            // InternalDedalADL.g:4917:1: ( (this_ID_0= RULE_ID )? kw= '(' this_REVISION_NUMB_2= RULE_REVISION_NUMB kw= ')' )
            {
            // InternalDedalADL.g:4917:1: ( (this_ID_0= RULE_ID )? kw= '(' this_REVISION_NUMB_2= RULE_REVISION_NUMB kw= ')' )
            // InternalDedalADL.g:4917:2: (this_ID_0= RULE_ID )? kw= '(' this_REVISION_NUMB_2= RULE_REVISION_NUMB kw= ')'
            {
            // InternalDedalADL.g:4917:2: (this_ID_0= RULE_ID )?
            int alt109=2;
            int LA109_0 = input.LA(1);

            if ( (LA109_0==RULE_ID) ) {
                alt109=1;
            }
            switch (alt109) {
                case 1 :
                    // InternalDedalADL.g:4917:7: this_ID_0= RULE_ID
                    {
                    this_ID_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_5); 

                    		current.merge(this_ID_0);
                        
                     
                        newLeafNode(this_ID_0, grammarAccess.getPre_versionAccess().getIDTerminalRuleCall_0()); 
                        

                    }
                    break;

            }

            kw=(Token)match(input,14,FollowSets000.FOLLOW_28); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPre_versionAccess().getLeftParenthesisKeyword_1()); 
                
            this_REVISION_NUMB_2=(Token)match(input,RULE_REVISION_NUMB,FollowSets000.FOLLOW_53); 

            		current.merge(this_REVISION_NUMB_2);
                
             
                newLeafNode(this_REVISION_NUMB_2, grammarAccess.getPre_versionAccess().getREVISION_NUMBTerminalRuleCall_2()); 
                
            kw=(Token)match(input,16,FollowSets000.FOLLOW_2); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPre_versionAccess().getRightParenthesisKeyword_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepre_version"


    // $ANTLR start "entryRulechange"
    // InternalDedalADL.g:4951:1: entryRulechange returns [String current=null] : iv_rulechange= rulechange EOF ;
    public final String entryRulechange() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulechange = null;


        try {
            // InternalDedalADL.g:4952:2: (iv_rulechange= rulechange EOF )
            // InternalDedalADL.g:4953:2: iv_rulechange= rulechange EOF
            {
             newCompositeNode(grammarAccess.getChangeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulechange=rulechange();

            state._fsp--;

             current =iv_rulechange.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulechange"


    // $ANTLR start "rulechange"
    // InternalDedalADL.g:4960:1: rulechange returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'change' this_ID_1= RULE_ID kw= 'time' this_change_time_3= rulechange_time kw= 'level' this_initial_level_5= ruleinitial_level kw= 'operation' this_change_operation_7= rulechange_operation kw= 'artifact' this_architecture_element_9= rulearchitecture_element kw= 'is' this_EString_11= ruleEString kw= 'purpose' this_change_purpose_13= rulechange_purpose kw= 'origin' this_change_origin_15= rulechange_origin (kw= 'from' this_change_17= rulechange )? ) ;
    public final AntlrDatatypeRuleToken rulechange() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        AntlrDatatypeRuleToken this_change_time_3 = null;

        AntlrDatatypeRuleToken this_initial_level_5 = null;

        AntlrDatatypeRuleToken this_change_operation_7 = null;

        AntlrDatatypeRuleToken this_architecture_element_9 = null;

        AntlrDatatypeRuleToken this_EString_11 = null;

        AntlrDatatypeRuleToken this_change_purpose_13 = null;

        AntlrDatatypeRuleToken this_change_origin_15 = null;

        AntlrDatatypeRuleToken this_change_17 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:4963:28: ( (kw= 'change' this_ID_1= RULE_ID kw= 'time' this_change_time_3= rulechange_time kw= 'level' this_initial_level_5= ruleinitial_level kw= 'operation' this_change_operation_7= rulechange_operation kw= 'artifact' this_architecture_element_9= rulearchitecture_element kw= 'is' this_EString_11= ruleEString kw= 'purpose' this_change_purpose_13= rulechange_purpose kw= 'origin' this_change_origin_15= rulechange_origin (kw= 'from' this_change_17= rulechange )? ) )
            // InternalDedalADL.g:4964:1: (kw= 'change' this_ID_1= RULE_ID kw= 'time' this_change_time_3= rulechange_time kw= 'level' this_initial_level_5= ruleinitial_level kw= 'operation' this_change_operation_7= rulechange_operation kw= 'artifact' this_architecture_element_9= rulearchitecture_element kw= 'is' this_EString_11= ruleEString kw= 'purpose' this_change_purpose_13= rulechange_purpose kw= 'origin' this_change_origin_15= rulechange_origin (kw= 'from' this_change_17= rulechange )? )
            {
            // InternalDedalADL.g:4964:1: (kw= 'change' this_ID_1= RULE_ID kw= 'time' this_change_time_3= rulechange_time kw= 'level' this_initial_level_5= ruleinitial_level kw= 'operation' this_change_operation_7= rulechange_operation kw= 'artifact' this_architecture_element_9= rulearchitecture_element kw= 'is' this_EString_11= ruleEString kw= 'purpose' this_change_purpose_13= rulechange_purpose kw= 'origin' this_change_origin_15= rulechange_origin (kw= 'from' this_change_17= rulechange )? )
            // InternalDedalADL.g:4965:2: kw= 'change' this_ID_1= RULE_ID kw= 'time' this_change_time_3= rulechange_time kw= 'level' this_initial_level_5= ruleinitial_level kw= 'operation' this_change_operation_7= rulechange_operation kw= 'artifact' this_architecture_element_9= rulearchitecture_element kw= 'is' this_EString_11= ruleEString kw= 'purpose' this_change_purpose_13= rulechange_purpose kw= 'origin' this_change_origin_15= rulechange_origin (kw= 'from' this_change_17= rulechange )?
            {
            kw=(Token)match(input,96,FollowSets000.FOLLOW_22); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getChangeAccess().getChangeKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_115); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getChangeAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,97,FollowSets000.FOLLOW_116); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getChangeAccess().getTimeKeyword_2()); 
                
             
                    newCompositeNode(grammarAccess.getChangeAccess().getChange_timeParserRuleCall_3()); 
                
            pushFollow(FollowSets000.FOLLOW_117);
            this_change_time_3=rulechange_time();

            state._fsp--;


            		current.merge(this_change_time_3);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,98,FollowSets000.FOLLOW_6); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getChangeAccess().getLevelKeyword_4()); 
                
             
                    newCompositeNode(grammarAccess.getChangeAccess().getInitial_levelParserRuleCall_5()); 
                
            pushFollow(FollowSets000.FOLLOW_118);
            this_initial_level_5=ruleinitial_level();

            state._fsp--;


            		current.merge(this_initial_level_5);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,99,FollowSets000.FOLLOW_119); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getChangeAccess().getOperationKeyword_6()); 
                
             
                    newCompositeNode(grammarAccess.getChangeAccess().getChange_operationParserRuleCall_7()); 
                
            pushFollow(FollowSets000.FOLLOW_120);
            this_change_operation_7=rulechange_operation();

            state._fsp--;


            		current.merge(this_change_operation_7);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,100,FollowSets000.FOLLOW_121); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getChangeAccess().getArtifactKeyword_8()); 
                
             
                    newCompositeNode(grammarAccess.getChangeAccess().getArchitecture_elementParserRuleCall_9()); 
                
            pushFollow(FollowSets000.FOLLOW_122);
            this_architecture_element_9=rulearchitecture_element();

            state._fsp--;


            		current.merge(this_architecture_element_9);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,101,FollowSets000.FOLLOW_3); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getChangeAccess().getIsKeyword_10()); 
                
             
                    newCompositeNode(grammarAccess.getChangeAccess().getEStringParserRuleCall_11()); 
                
            pushFollow(FollowSets000.FOLLOW_123);
            this_EString_11=ruleEString();

            state._fsp--;


            		current.merge(this_EString_11);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,102,FollowSets000.FOLLOW_124); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getChangeAccess().getPurposeKeyword_12()); 
                
             
                    newCompositeNode(grammarAccess.getChangeAccess().getChange_purposeParserRuleCall_13()); 
                
            pushFollow(FollowSets000.FOLLOW_125);
            this_change_purpose_13=rulechange_purpose();

            state._fsp--;


            		current.merge(this_change_purpose_13);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,103,FollowSets000.FOLLOW_126); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getChangeAccess().getOriginKeyword_14()); 
                
             
                    newCompositeNode(grammarAccess.getChangeAccess().getChange_originParserRuleCall_15()); 
                
            pushFollow(FollowSets000.FOLLOW_127);
            this_change_origin_15=rulechange_origin();

            state._fsp--;


            		current.merge(this_change_origin_15);
                
             
                    afterParserOrEnumRuleCall();
                
            // InternalDedalADL.g:5096:1: (kw= 'from' this_change_17= rulechange )?
            int alt110=2;
            int LA110_0 = input.LA(1);

            if ( (LA110_0==104) ) {
                alt110=1;
            }
            switch (alt110) {
                case 1 :
                    // InternalDedalADL.g:5097:2: kw= 'from' this_change_17= rulechange
                    {
                    kw=(Token)match(input,104,FollowSets000.FOLLOW_32); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getChangeAccess().getFromKeyword_16_0()); 
                        
                     
                            newCompositeNode(grammarAccess.getChangeAccess().getChangeParserRuleCall_16_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_change_17=rulechange();

                    state._fsp--;


                    		current.merge(this_change_17);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulechange"


    // $ANTLR start "entryRulechange_time"
    // InternalDedalADL.g:5121:1: entryRulechange_time returns [String current=null] : iv_rulechange_time= rulechange_time EOF ;
    public final String entryRulechange_time() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulechange_time = null;


        try {
            // InternalDedalADL.g:5122:2: (iv_rulechange_time= rulechange_time EOF )
            // InternalDedalADL.g:5123:2: iv_rulechange_time= rulechange_time EOF
            {
             newCompositeNode(grammarAccess.getChange_timeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulechange_time=rulechange_time();

            state._fsp--;

             current =iv_rulechange_time.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulechange_time"


    // $ANTLR start "rulechange_time"
    // InternalDedalADL.g:5130:1: rulechange_time returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'static' | kw= 'dynamic' ) ;
    public final AntlrDatatypeRuleToken rulechange_time() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:5133:28: ( (kw= 'static' | kw= 'dynamic' ) )
            // InternalDedalADL.g:5134:1: (kw= 'static' | kw= 'dynamic' )
            {
            // InternalDedalADL.g:5134:1: (kw= 'static' | kw= 'dynamic' )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==105) ) {
                alt111=1;
            }
            else if ( (LA111_0==106) ) {
                alt111=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // InternalDedalADL.g:5135:2: kw= 'static'
                    {
                    kw=(Token)match(input,105,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getChange_timeAccess().getStaticKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:5142:2: kw= 'dynamic'
                    {
                    kw=(Token)match(input,106,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getChange_timeAccess().getDynamicKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulechange_time"


    // $ANTLR start "entryRuleinitial_level"
    // InternalDedalADL.g:5155:1: entryRuleinitial_level returns [String current=null] : iv_ruleinitial_level= ruleinitial_level EOF ;
    public final String entryRuleinitial_level() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleinitial_level = null;


        try {
            // InternalDedalADL.g:5156:2: (iv_ruleinitial_level= ruleinitial_level EOF )
            // InternalDedalADL.g:5157:2: iv_ruleinitial_level= ruleinitial_level EOF
            {
             newCompositeNode(grammarAccess.getInitial_levelRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleinitial_level=ruleinitial_level();

            state._fsp--;

             current =iv_ruleinitial_level.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleinitial_level"


    // $ANTLR start "ruleinitial_level"
    // InternalDedalADL.g:5164:1: ruleinitial_level returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'specification' | kw= 'configuration' | kw= 'assembly' ) ;
    public final AntlrDatatypeRuleToken ruleinitial_level() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:5167:28: ( (kw= 'specification' | kw= 'configuration' | kw= 'assembly' ) )
            // InternalDedalADL.g:5168:1: (kw= 'specification' | kw= 'configuration' | kw= 'assembly' )
            {
            // InternalDedalADL.g:5168:1: (kw= 'specification' | kw= 'configuration' | kw= 'assembly' )
            int alt112=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt112=1;
                }
                break;
            case 49:
                {
                alt112=2;
                }
                break;
            case 77:
                {
                alt112=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // InternalDedalADL.g:5169:2: kw= 'specification'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInitial_levelAccess().getSpecificationKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:5176:2: kw= 'configuration'
                    {
                    kw=(Token)match(input,49,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInitial_levelAccess().getConfigurationKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalDedalADL.g:5183:2: kw= 'assembly'
                    {
                    kw=(Token)match(input,77,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getInitial_levelAccess().getAssemblyKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleinitial_level"


    // $ANTLR start "entryRulechange_operation"
    // InternalDedalADL.g:5196:1: entryRulechange_operation returns [String current=null] : iv_rulechange_operation= rulechange_operation EOF ;
    public final String entryRulechange_operation() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulechange_operation = null;


        try {
            // InternalDedalADL.g:5197:2: (iv_rulechange_operation= rulechange_operation EOF )
            // InternalDedalADL.g:5198:2: iv_rulechange_operation= rulechange_operation EOF
            {
             newCompositeNode(grammarAccess.getChange_operationRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulechange_operation=rulechange_operation();

            state._fsp--;

             current =iv_rulechange_operation.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulechange_operation"


    // $ANTLR start "rulechange_operation"
    // InternalDedalADL.g:5205:1: rulechange_operation returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'addition' | kw= 'removal' | kw= 'substitution' | kw= 'modification' ) ;
    public final AntlrDatatypeRuleToken rulechange_operation() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:5208:28: ( (kw= 'addition' | kw= 'removal' | kw= 'substitution' | kw= 'modification' ) )
            // InternalDedalADL.g:5209:1: (kw= 'addition' | kw= 'removal' | kw= 'substitution' | kw= 'modification' )
            {
            // InternalDedalADL.g:5209:1: (kw= 'addition' | kw= 'removal' | kw= 'substitution' | kw= 'modification' )
            int alt113=4;
            switch ( input.LA(1) ) {
            case 107:
                {
                alt113=1;
                }
                break;
            case 108:
                {
                alt113=2;
                }
                break;
            case 109:
                {
                alt113=3;
                }
                break;
            case 110:
                {
                alt113=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalDedalADL.g:5210:2: kw= 'addition'
                    {
                    kw=(Token)match(input,107,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getChange_operationAccess().getAdditionKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:5217:2: kw= 'removal'
                    {
                    kw=(Token)match(input,108,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getChange_operationAccess().getRemovalKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalDedalADL.g:5224:2: kw= 'substitution'
                    {
                    kw=(Token)match(input,109,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getChange_operationAccess().getSubstitutionKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // InternalDedalADL.g:5231:2: kw= 'modification'
                    {
                    kw=(Token)match(input,110,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getChange_operationAccess().getModificationKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulechange_operation"


    // $ANTLR start "entryRulearchitecture_element"
    // InternalDedalADL.g:5244:1: entryRulearchitecture_element returns [String current=null] : iv_rulearchitecture_element= rulearchitecture_element EOF ;
    public final String entryRulearchitecture_element() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulearchitecture_element = null;


        try {
            // InternalDedalADL.g:5245:2: (iv_rulearchitecture_element= rulearchitecture_element EOF )
            // InternalDedalADL.g:5246:2: iv_rulearchitecture_element= rulearchitecture_element EOF
            {
             newCompositeNode(grammarAccess.getArchitecture_elementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulearchitecture_element=rulearchitecture_element();

            state._fsp--;

             current =iv_rulearchitecture_element.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulearchitecture_element"


    // $ANTLR start "rulearchitecture_element"
    // InternalDedalADL.g:5253:1: rulearchitecture_element returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_specification_element_0= rulespecification_element | this_configuration_element_1= ruleconfiguration_element | this_assembly_element_2= ruleassembly_element ) ;
    public final AntlrDatatypeRuleToken rulearchitecture_element() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_specification_element_0 = null;

        AntlrDatatypeRuleToken this_configuration_element_1 = null;

        AntlrDatatypeRuleToken this_assembly_element_2 = null;


         enterRule(); 
            
        try {
            // InternalDedalADL.g:5256:28: ( (this_specification_element_0= rulespecification_element | this_configuration_element_1= ruleconfiguration_element | this_assembly_element_2= ruleassembly_element ) )
            // InternalDedalADL.g:5257:1: (this_specification_element_0= rulespecification_element | this_configuration_element_1= ruleconfiguration_element | this_assembly_element_2= ruleassembly_element )
            {
            // InternalDedalADL.g:5257:1: (this_specification_element_0= rulespecification_element | this_configuration_element_1= ruleconfiguration_element | this_assembly_element_2= ruleassembly_element )
            int alt114=3;
            switch ( input.LA(1) ) {
            case 33:
            case 45:
            case 111:
                {
                alt114=1;
                }
                break;
            case 112:
            case 113:
                {
                alt114=2;
                }
                break;
            case 83:
            case 114:
            case 115:
                {
                alt114=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // InternalDedalADL.g:5258:5: this_specification_element_0= rulespecification_element
                    {
                     
                            newCompositeNode(grammarAccess.getArchitecture_elementAccess().getSpecification_elementParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_specification_element_0=rulespecification_element();

                    state._fsp--;


                    		current.merge(this_specification_element_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:5270:5: this_configuration_element_1= ruleconfiguration_element
                    {
                     
                            newCompositeNode(grammarAccess.getArchitecture_elementAccess().getConfiguration_elementParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_configuration_element_1=ruleconfiguration_element();

                    state._fsp--;


                    		current.merge(this_configuration_element_1);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // InternalDedalADL.g:5282:5: this_assembly_element_2= ruleassembly_element
                    {
                     
                            newCompositeNode(grammarAccess.getArchitecture_elementAccess().getAssembly_elementParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_assembly_element_2=ruleassembly_element();

                    state._fsp--;


                    		current.merge(this_assembly_element_2);
                        
                     
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulearchitecture_element"


    // $ANTLR start "entryRulespecification_element"
    // InternalDedalADL.g:5300:1: entryRulespecification_element returns [String current=null] : iv_rulespecification_element= rulespecification_element EOF ;
    public final String entryRulespecification_element() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulespecification_element = null;


        try {
            // InternalDedalADL.g:5301:2: (iv_rulespecification_element= rulespecification_element EOF )
            // InternalDedalADL.g:5302:2: iv_rulespecification_element= rulespecification_element EOF
            {
             newCompositeNode(grammarAccess.getSpecification_elementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulespecification_element=rulespecification_element();

            state._fsp--;

             current =iv_rulespecification_element.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulespecification_element"


    // $ANTLR start "rulespecification_element"
    // InternalDedalADL.g:5309:1: rulespecification_element returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'component_role' | kw= 'connection' | kw= 'architecture_behavior' ) ;
    public final AntlrDatatypeRuleToken rulespecification_element() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:5312:28: ( (kw= 'component_role' | kw= 'connection' | kw= 'architecture_behavior' ) )
            // InternalDedalADL.g:5313:1: (kw= 'component_role' | kw= 'connection' | kw= 'architecture_behavior' )
            {
            // InternalDedalADL.g:5313:1: (kw= 'component_role' | kw= 'connection' | kw= 'architecture_behavior' )
            int alt115=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt115=1;
                }
                break;
            case 45:
                {
                alt115=2;
                }
                break;
            case 111:
                {
                alt115=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // InternalDedalADL.g:5314:2: kw= 'component_role'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSpecification_elementAccess().getComponent_roleKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:5321:2: kw= 'connection'
                    {
                    kw=(Token)match(input,45,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSpecification_elementAccess().getConnectionKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalDedalADL.g:5328:2: kw= 'architecture_behavior'
                    {
                    kw=(Token)match(input,111,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getSpecification_elementAccess().getArchitecture_behaviorKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulespecification_element"


    // $ANTLR start "entryRuleconfiguration_element"
    // InternalDedalADL.g:5341:1: entryRuleconfiguration_element returns [String current=null] : iv_ruleconfiguration_element= ruleconfiguration_element EOF ;
    public final String entryRuleconfiguration_element() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleconfiguration_element = null;


        try {
            // InternalDedalADL.g:5342:2: (iv_ruleconfiguration_element= ruleconfiguration_element EOF )
            // InternalDedalADL.g:5343:2: iv_ruleconfiguration_element= ruleconfiguration_element EOF
            {
             newCompositeNode(grammarAccess.getConfiguration_elementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleconfiguration_element=ruleconfiguration_element();

            state._fsp--;

             current =iv_ruleconfiguration_element.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleconfiguration_element"


    // $ANTLR start "ruleconfiguration_element"
    // InternalDedalADL.g:5350:1: ruleconfiguration_element returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'component_class' | kw= 'connector_class' ) ;
    public final AntlrDatatypeRuleToken ruleconfiguration_element() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:5353:28: ( (kw= 'component_class' | kw= 'connector_class' ) )
            // InternalDedalADL.g:5354:1: (kw= 'component_class' | kw= 'connector_class' )
            {
            // InternalDedalADL.g:5354:1: (kw= 'component_class' | kw= 'connector_class' )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==112) ) {
                alt116=1;
            }
            else if ( (LA116_0==113) ) {
                alt116=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // InternalDedalADL.g:5355:2: kw= 'component_class'
                    {
                    kw=(Token)match(input,112,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConfiguration_elementAccess().getComponent_classKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:5362:2: kw= 'connector_class'
                    {
                    kw=(Token)match(input,113,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getConfiguration_elementAccess().getConnector_classKeyword_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleconfiguration_element"


    // $ANTLR start "entryRuleassembly_element"
    // InternalDedalADL.g:5375:1: entryRuleassembly_element returns [String current=null] : iv_ruleassembly_element= ruleassembly_element EOF ;
    public final String entryRuleassembly_element() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleassembly_element = null;


        try {
            // InternalDedalADL.g:5376:2: (iv_ruleassembly_element= ruleassembly_element EOF )
            // InternalDedalADL.g:5377:2: iv_ruleassembly_element= ruleassembly_element EOF
            {
             newCompositeNode(grammarAccess.getAssembly_elementRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleassembly_element=ruleassembly_element();

            state._fsp--;

             current =iv_ruleassembly_element.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleassembly_element"


    // $ANTLR start "ruleassembly_element"
    // InternalDedalADL.g:5384:1: ruleassembly_element returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'component_instance' | kw= 'connector_instance' | kw= 'assembly_constraint' ) ;
    public final AntlrDatatypeRuleToken ruleassembly_element() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:5387:28: ( (kw= 'component_instance' | kw= 'connector_instance' | kw= 'assembly_constraint' ) )
            // InternalDedalADL.g:5388:1: (kw= 'component_instance' | kw= 'connector_instance' | kw= 'assembly_constraint' )
            {
            // InternalDedalADL.g:5388:1: (kw= 'component_instance' | kw= 'connector_instance' | kw= 'assembly_constraint' )
            int alt117=3;
            switch ( input.LA(1) ) {
            case 83:
                {
                alt117=1;
                }
                break;
            case 114:
                {
                alt117=2;
                }
                break;
            case 115:
                {
                alt117=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // InternalDedalADL.g:5389:2: kw= 'component_instance'
                    {
                    kw=(Token)match(input,83,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAssembly_elementAccess().getComponent_instanceKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:5396:2: kw= 'connector_instance'
                    {
                    kw=(Token)match(input,114,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAssembly_elementAccess().getConnector_instanceKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalDedalADL.g:5403:2: kw= 'assembly_constraint'
                    {
                    kw=(Token)match(input,115,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAssembly_elementAccess().getAssembly_constraintKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleassembly_element"


    // $ANTLR start "entryRulechange_purpose"
    // InternalDedalADL.g:5416:1: entryRulechange_purpose returns [String current=null] : iv_rulechange_purpose= rulechange_purpose EOF ;
    public final String entryRulechange_purpose() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulechange_purpose = null;


        try {
            // InternalDedalADL.g:5417:2: (iv_rulechange_purpose= rulechange_purpose EOF )
            // InternalDedalADL.g:5418:2: iv_rulechange_purpose= rulechange_purpose EOF
            {
             newCompositeNode(grammarAccess.getChange_purposeRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulechange_purpose=rulechange_purpose();

            state._fsp--;

             current =iv_rulechange_purpose.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulechange_purpose"


    // $ANTLR start "rulechange_purpose"
    // InternalDedalADL.g:5425:1: rulechange_purpose returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'corrective' | kw= 'perfective' | kw= 'adaptative' ) ;
    public final AntlrDatatypeRuleToken rulechange_purpose() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:5428:28: ( (kw= 'corrective' | kw= 'perfective' | kw= 'adaptative' ) )
            // InternalDedalADL.g:5429:1: (kw= 'corrective' | kw= 'perfective' | kw= 'adaptative' )
            {
            // InternalDedalADL.g:5429:1: (kw= 'corrective' | kw= 'perfective' | kw= 'adaptative' )
            int alt118=3;
            switch ( input.LA(1) ) {
            case 116:
                {
                alt118=1;
                }
                break;
            case 117:
                {
                alt118=2;
                }
                break;
            case 118:
                {
                alt118=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 118, 0, input);

                throw nvae;
            }

            switch (alt118) {
                case 1 :
                    // InternalDedalADL.g:5430:2: kw= 'corrective'
                    {
                    kw=(Token)match(input,116,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getChange_purposeAccess().getCorrectiveKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:5437:2: kw= 'perfective'
                    {
                    kw=(Token)match(input,117,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getChange_purposeAccess().getPerfectiveKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalDedalADL.g:5444:2: kw= 'adaptative'
                    {
                    kw=(Token)match(input,118,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getChange_purposeAccess().getAdaptativeKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulechange_purpose"


    // $ANTLR start "entryRulechange_origin"
    // InternalDedalADL.g:5457:1: entryRulechange_origin returns [String current=null] : iv_rulechange_origin= rulechange_origin EOF ;
    public final String entryRulechange_origin() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulechange_origin = null;


        try {
            // InternalDedalADL.g:5458:2: (iv_rulechange_origin= rulechange_origin EOF )
            // InternalDedalADL.g:5459:2: iv_rulechange_origin= rulechange_origin EOF
            {
             newCompositeNode(grammarAccess.getChange_originRule()); 
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulechange_origin=rulechange_origin();

            state._fsp--;

             current =iv_rulechange_origin.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_2); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulechange_origin"


    // $ANTLR start "rulechange_origin"
    // InternalDedalADL.g:5466:1: rulechange_origin returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'given' | kw= 'generated' | kw= 'propagated' ) ;
    public final AntlrDatatypeRuleToken rulechange_origin() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // InternalDedalADL.g:5469:28: ( (kw= 'given' | kw= 'generated' | kw= 'propagated' ) )
            // InternalDedalADL.g:5470:1: (kw= 'given' | kw= 'generated' | kw= 'propagated' )
            {
            // InternalDedalADL.g:5470:1: (kw= 'given' | kw= 'generated' | kw= 'propagated' )
            int alt119=3;
            switch ( input.LA(1) ) {
            case 119:
                {
                alt119=1;
                }
                break;
            case 120:
                {
                alt119=2;
                }
                break;
            case 121:
                {
                alt119=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;
            }

            switch (alt119) {
                case 1 :
                    // InternalDedalADL.g:5471:2: kw= 'given'
                    {
                    kw=(Token)match(input,119,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getChange_originAccess().getGivenKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:5478:2: kw= 'generated'
                    {
                    kw=(Token)match(input,120,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getChange_originAccess().getGeneratedKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // InternalDedalADL.g:5485:2: kw= 'propagated'
                    {
                    kw=(Token)match(input,121,FollowSets000.FOLLOW_2); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getChange_originAccess().getPropagatedKeyword_2()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulechange_origin"


    // $ANTLR start "ruleDIRECTION"
    // InternalDedalADL.g:5498:1: ruleDIRECTION returns [Enumerator current=null] : ( (enumLiteral_0= 'provided' ) | (enumLiteral_1= 'required' ) ) ;
    public final Enumerator ruleDIRECTION() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // InternalDedalADL.g:5500:28: ( ( (enumLiteral_0= 'provided' ) | (enumLiteral_1= 'required' ) ) )
            // InternalDedalADL.g:5501:1: ( (enumLiteral_0= 'provided' ) | (enumLiteral_1= 'required' ) )
            {
            // InternalDedalADL.g:5501:1: ( (enumLiteral_0= 'provided' ) | (enumLiteral_1= 'required' ) )
            int alt120=2;
            int LA120_0 = input.LA(1);

            if ( (LA120_0==65) ) {
                alt120=1;
            }
            else if ( (LA120_0==66) ) {
                alt120=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 120, 0, input);

                throw nvae;
            }
            switch (alt120) {
                case 1 :
                    // InternalDedalADL.g:5501:2: (enumLiteral_0= 'provided' )
                    {
                    // InternalDedalADL.g:5501:2: (enumLiteral_0= 'provided' )
                    // InternalDedalADL.g:5501:4: enumLiteral_0= 'provided'
                    {
                    enumLiteral_0=(Token)match(input,65,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getDIRECTIONAccess().getPROVIDEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDIRECTIONAccess().getPROVIDEDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // InternalDedalADL.g:5507:6: (enumLiteral_1= 'required' )
                    {
                    // InternalDedalADL.g:5507:6: (enumLiteral_1= 'required' )
                    // InternalDedalADL.g:5507:8: enumLiteral_1= 'required'
                    {
                    enumLiteral_1=(Token)match(input,66,FollowSets000.FOLLOW_2); 

                            current = grammarAccess.getDIRECTIONAccess().getREQUIREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDIRECTIONAccess().getREQUIREDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDIRECTION"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000022002L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0002000008000000L,0x0000000000002000L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000018000L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020002L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000180002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x2300000200000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003200002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002200002L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001200002L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000001F0100002L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00000001E0108002L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00002001C0100002L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000180100002L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000004020L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100100002L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000008002L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000000F800000002L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000000F000008002L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000E000008002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000080L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000C000000002L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000008000000002L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010000000000L,0x0000000000000A00L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000006L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000180000000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000100000000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000400000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0001000000000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x00DC0001C0100002L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x00D80001C010C002L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x00D80001C0108002L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x00D8000180100002L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x00D8000100100002L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00D8000000100002L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x2200000000000000L});
        public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x00D0000000108002L});
        public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x00C0000000108002L});
        public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x00C0000000000002L});
        public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0080000000000002L});
        public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
        public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000009800000002L});
        public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000009000008002L});
        public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000008000008002L});
        public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0020000400000000L});
        public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000400008000L});
        public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0004000000000000L});
        public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x1C000000C0000002L});
        public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x18000000C0000002L});
        public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x10000000C0000002L});
        public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x1000000080000002L});
        public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_77 = new BitSet(new long[]{0xDC000000C0000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_78 = new BitSet(new long[]{0xD8000000C0004002L,0x0000000000000001L});
        public static final BitSet FOLLOW_79 = new BitSet(new long[]{0xD8000000C0000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x98000000C0000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x90000000C0000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x9000000080000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x9000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x1000000000000002L,0x0000000000000001L});
        public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000001L});
        public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000004L});
        public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
        public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
        public static final BitSet FOLLOW_89 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
        public static final BitSet FOLLOW_90 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_91 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_92 = new BitSet(new long[]{0x0000000800008000L});
        public static final BitSet FOLLOW_93 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_94 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
        public static final BitSet FOLLOW_95 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_96 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000400L});
        public static final BitSet FOLLOW_97 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
        public static final BitSet FOLLOW_98 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
        public static final BitSet FOLLOW_99 = new BitSet(new long[]{0x0000000040004000L,0x0000000000008000L});
        public static final BitSet FOLLOW_100 = new BitSet(new long[]{0x0000000040000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
        public static final BitSet FOLLOW_102 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
        public static final BitSet FOLLOW_103 = new BitSet(new long[]{0x0000000180100002L,0x0000000000030000L});
        public static final BitSet FOLLOW_104 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
        public static final BitSet FOLLOW_105 = new BitSet(new long[]{0x0000000180100002L,0x0000000000020000L});
        public static final BitSet FOLLOW_106 = new BitSet(new long[]{0x0000000100100002L,0x0000000000020000L});
        public static final BitSet FOLLOW_107 = new BitSet(new long[]{0x0000000000100002L,0x0000000000020000L});
        public static final BitSet FOLLOW_108 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
        public static final BitSet FOLLOW_109 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
        public static final BitSet FOLLOW_110 = new BitSet(new long[]{0x0000000000000020L,0x0000000000400000L});
        public static final BitSet FOLLOW_111 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
        public static final BitSet FOLLOW_112 = new BitSet(new long[]{0x0000000000000000L,0x0000000001800000L});
        public static final BitSet FOLLOW_113 = new BitSet(new long[]{0x0000000000000000L,0x000000007E000000L});
        public static final BitSet FOLLOW_114 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
        public static final BitSet FOLLOW_115 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
        public static final BitSet FOLLOW_116 = new BitSet(new long[]{0x0000000000000000L,0x0000060000000000L});
        public static final BitSet FOLLOW_117 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
        public static final BitSet FOLLOW_118 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
        public static final BitSet FOLLOW_119 = new BitSet(new long[]{0x0000000000000000L,0x0000780000000000L});
        public static final BitSet FOLLOW_120 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
        public static final BitSet FOLLOW_121 = new BitSet(new long[]{0x0000200200000000L,0x000F800000080000L});
        public static final BitSet FOLLOW_122 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
        public static final BitSet FOLLOW_123 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
        public static final BitSet FOLLOW_124 = new BitSet(new long[]{0x0000000000000000L,0x0070000000000000L});
        public static final BitSet FOLLOW_125 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
        public static final BitSet FOLLOW_126 = new BitSet(new long[]{0x0000000000000000L,0x0380000000000000L});
        public static final BitSet FOLLOW_127 = new BitSet(new long[]{0x0000000000000002L,0x0000010000000000L});
    }


}