# Copyright (C) 2015 Khem Raj <raj.khem@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "OpenWrt MDNS daemon"
HOMEPAGE = "http://git.openwrt.org/?p=project/mdnsd.git;a=summary"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://main.c;beginline=1;endline=12;md5=ce0be9da20a926574bf76c1285343bef"
SECTION = "base"
DEPENDS = "json-c libubox ubus"

SRCREV = "ae8773477c31b741ba8b47f8898e4c0a1c834b85"
SRC_URI = "git://git.openwrt.org/project/mdnsd.git \
          "

inherit cmake pkgconfig

S = "${WORKDIR}/git"

FILES_SOLIBSDEV = ""

FILES_${PN}  += "${libdir}/*"
