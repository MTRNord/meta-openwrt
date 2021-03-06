# Copyright (C) 2015 Khem Raj <raj.khem@gmail.com>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Library for accessing wireless device drivers"
HOMEPAGE = "http://git.openwrt.org/?p=project/iwinfo.git;a=summary"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"
SECTION = "base"
DEPENDS += "uci lua5.1"

inherit openwrt

CFLAGS += "-fPIC"

SRCREV = "813f61e48b9b1a76cb55f3b4a229bf98d3cd53a9"
SRC_URI = "git://git.openwrt.org/project/iwinfo.git \
           file://0001-fix-typo-in-spcifying-typename-luaL_Reg.patch \
           file://0001-fix-order-of-linker-cmdline-to-help-linking-when-usi.patch \
           file://0001-Makefile-LDFLAGS-set-liblua5.1-for-lua-lib.patch \
          "

S = "${WORKDIR}/git"

do_install() {
	install -D -m 0755 ${B}/libiwinfo.so ${D}${libdir}/libiwinfo.so
	install -D -m 0644 ${S}/include/iwinfo.h ${D}${includedir}/iwinfo.h
	install -D -m 0644 ${S}/include/iwinfo/utils.h ${D}${includedir}/iwinfo/utils.h
}
