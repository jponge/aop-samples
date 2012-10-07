# Notes

## Cold start

Start the JVM with Byteman and a script:

    java -javaagent:${BYTEMAN_HOME}/lib/byteman.jar=boot:${BYTEMAN_HOME}/lib/byteman.jar,script:Explode.btm -Dorg.jboss.byteman.transform.all Sum

Start the JVM with Byteman in listener mode with full reloading:

    java -javaagent:${BYTEMAN_HOME}/lib/byteman.jar=listener:true,boot:${BYTEMAN_HOME}/lib/byteman.jar -Dorg.jboss.byteman.transform.all HelloWorld

Dynamically plug a new rule:

    bmsubmit.sh CallingPrint.btm

See the current rules:

    bmsubmit.sh

Unload a rule:

    bmsubmit.sh -u CallingPrint.btm

## On the fly

Get the target JVM PID:

    jps -l

then:

    bminstall.sh 5402

and go ahead:

    bmsubmit.sh CallingPrint.btm

**Warning:** `StringBuilding.btm` won't work as the agent cannot catch java.lang.StringBuilder from here.
Instead, use `HotStringBuilding.btm` which intercepts invocations.

## Boosting

Byteman rules are being evaluated by default.

The `-Dorg.jboss.byteman.compile.to.bytecode` turns bytecode generation on, resulting in faster code.

    bminstall.sh -Dorg.jboss.byteman.compile.to.bytecode 5506

