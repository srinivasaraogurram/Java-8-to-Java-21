# This script sets up the Java 21 environment using SDKMAN.
# It installs SDKMAN if not already installed, and then installs Java 21.0.6-tem.
# It also sets the Java version to 21.0.6-tem.
# Usage: Run this script in a terminal to set up the Java 21 environment.
# Check if SDKMAN is installed
if [ ! -d "$HOME/.sdkman" ]; then
  # Install SDKMAN
  curl -s "https://get.sdkman.io" | bash
  source "$HOME/.sdkman/bin/sdkman-init.sh"
fi
# Load SDKMAN
source "$HOME/.sdkman/bin/sdkman-init.sh"
# Install Java 21.0.6-tem   
sdk install java 21.0.6-tem
sdk use java 21.0.6-tem
sdk current java