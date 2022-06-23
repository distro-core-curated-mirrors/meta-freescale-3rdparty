# Adapted from linux-imx.inc, copyright (C) 2013, 2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

require recipes-kernel/linux/linux-imx.inc

SUMMARY = "Linux kernel for Boundary Devices boards"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

LINUX_VERSION = "5.15.38"

SRC_URI = "git://github.com/boundarydevices/linux-imx6.git;branch=${SRCBRANCH};protocol=https \
"

LOCALVERSION = "-1.0.0+yocto"
SRCBRANCH = "boundary-imx_5.15.y"
SRCREV = "c893df2e51bed85dbab2667d97a34aa1d2ddd757"
DEPENDS += "lzop-native bc-native"
COMPATIBLE_MACHINE = "(nitrogen6x|nitrogen6x-lite|nitrogen6sx|nitrogen7|nitrogen8m|nitrogen8mm|nitrogen8mn|nitrogen8mp)"

KBUILD_DEFCONFIG ?= "boundary_defconfig"

S = "${WORKDIR}/git"