// https://www.edureka.co/community/358/how-to-execute-a-python-file-with-few-arguments-in-java

public class ScriptPython {
    
    public void runScript(String archivo, String arg1, String arg2) throws Exception{
        Runtime.getRuntime().exec(new String[]{"python",archivo,arg1,arg2});
    }
}

