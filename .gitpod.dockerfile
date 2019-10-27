FROM gitpod/workspace-full

RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh \
             && sdk install scala 2.13.1 \
             && sdk install sbt 1.3.3"