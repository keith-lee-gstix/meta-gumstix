require recipes-kernel/linux/linux-yocto.inc

COMPATIBLE_MACHINE = "duovero"

LINUX_VERSION = "3.17"
LINUX_VERSION_EXTENSION = "-custom"

BOOT_SPLASH ?= "logo_linux_clut224-generic.ppm"

FILESEXTRAPATHS_prepend := "${THISDIR}/linux-gumstix-3.17:"

S = "${WORKDIR}/git"

# v3.17 = bfe01a5ba2490f299e1d2d5508cbbbadd897bbe9
SRCREV = "bfe01a5ba2490f299e1d2d5508cbbbadd897bbe9"
SRC_URI = " \
    git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux-stable.git;nocheckout=1;branch=linux-3.17.y \
    file://0001-ARM-Gumstix-DuoVero-Bind-vdac-regulator-to-hdmi-node.patch \
    file://defconfig \
    file://${BOOT_SPLASH} \
"
