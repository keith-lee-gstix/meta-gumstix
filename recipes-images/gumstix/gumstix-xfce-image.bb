DESCRIPTION = "The Gumstix XFCE image"

require gumstix-console-image.bb

XSERVER +=  "\
  xmodmap \
  xrdb \
  setxkbmap \
 "

XFCE_INSTALL = " \
  task-xfce-base \
  gdm-systemd \
  gtk-tweak \
  "

XFCE_APPS = "\
  epiphany \
  xterm \
 "

IMAGE_INSTALL += " \
  ${XSERVER} \
  ${XFCE_INSTALL} \
 "

# this section removes remnants of legacy sysvinit support
# for packages installed above
IMAGE_FILE_BLACKLIST += " \
			 /usr/share/xsessions/gnome.desktop \
			/usr/share/gdm/autostart/LoginWindow/at-spi-registryd-wrapper.desktop \
			/usr/share/gdm/autostart/LoginWindow/gnome-mag.desktop \
			/usr/share/gdm/autostart/LoginWindow/gnome-power-manager.desktop \
			/usr/share/gdm/autostart/LoginWindow/gnome-settings-daemon.desktop \
			/usr/share/gdm/autostart/LoginWindow/gok.desktop \
			/usr/share/gdm/autostart/LoginWindow/libcanberra-ready-sound.desktop \
			/usr/share/gdm/autostart/LoginWindow/metacity.desktop \
			/usr/share/gdm/autostart/LoginWindow/orca-screen-reader.desktop \
                       "

