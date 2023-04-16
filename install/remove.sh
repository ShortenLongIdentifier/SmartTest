#!/bin/bash

set -e

# Define the installation directory
INSTALL_DIR="/usr/local/bin"

# Check if a previous version of SmartTest exists and remove it
if [ -e "$INSTALL_DIR/SmartTest.run" ]; then
  echo "Removing previous version of SmartTest..."
  sudo rm "$INSTALL_DIR/SmartTest.run"
  sudo rm "$INSTALL_DIR/SmartTest"
fi

# Print a message to the user indicating that the uninstallation is complete
echo "SmartTest has been uninstalled successfully!"

