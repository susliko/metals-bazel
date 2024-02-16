load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

skylib_version = "1.0.3"

http_archive(
    name = "bazel_skylib",
    sha256 = "1c531376ac7e5a180e0237938a2536de0c54d93f5c278634818e0efc952dd56c",
    type = "tar.gz",
    url = "https://mirror.bazel.build/github.com/bazelbuild/bazel-skylib/releases/download/{}/bazel-skylib-{}.tar.gz".format(skylib_version, skylib_version),
)

rules_proto_commit = "dcf9e47b0df2218ca33e02a1a51803ab3134f42d"
http_archive(
    name = "rules_proto",
    sha256 = "d31d04a8bb1912fbc122bcc7eea49964c9b75c6e091ac3f9deea2bb6a8025a4a",
    strip_prefix = "rules_proto-%s" % rules_proto_commit,
    urls = [
        "https://github.com/bazelbuild/rules_proto/archive/%s.tar.gz" % rules_proto_commit,
    ],
)

load("@rules_proto//proto:repositories.bzl", "rules_proto_dependencies", "rules_proto_toolchains")

rules_proto_dependencies()

rules_proto_toolchains()

# See https://github.com/bazelbuild/rules_scala/releases for up to date version information.
http_archive(
    name = "io_bazel_rules_scala",
    sha256 = "9a23058a36183a556a9ba7229b4f204d3e68c8c6eb7b28260521016b38ef4e00",
    strip_prefix = "rules_scala-6.4.0",
    url = "https://github.com/bazelbuild/rules_scala/releases/download/v6.4.0/rules_scala-v6.4.0.tar.gz",
)

load("@io_bazel_rules_scala//:scala_config.bzl", "scala_config")
scala_config("3.3.0")

load("@io_bazel_rules_scala//scala:scala.bzl", "scala_repositories")

load("@io_bazel_rules_scala//scala:toolchains.bzl", "scala_register_toolchains")
scala_register_toolchains()
register_toolchains("//:toolchain")

load("@io_bazel_rules_scala//testing:scalatest.bzl", "scalatest_repositories", "scalatest_toolchain")
scalatest_repositories()
scalatest_toolchain()

scala_repositories()

RULES_JVM_EXTERNAL_TAG = "4.5"
RULES_JVM_EXTERNAL_SHA = "b17d7388feb9bfa7f2fa09031b32707df529f26c91ab9e5d909eb1676badd9a6"

http_archive(
    name = "rules_jvm_external",
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    sha256 = RULES_JVM_EXTERNAL_SHA,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")

rules_jvm_external_deps()

load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")

rules_jvm_external_setup()

load("@rules_jvm_external//:defs.bzl", "maven_install")

maven_install(
    artifacts = [
        "org.typelevel:cats-effect_3:3.5.2",
        "org.typelevel:cats-core_3:2.9.0",
        "org.scalatest:scalatest_3:3.2.11",
    ],
    repositories = [
        "https://maven.google.com",
        "https://repo1.maven.org/maven2",
    ],
    maven_install_json = "//:maven_install.json",
    fetch_sources = True
)
load("@maven//:defs.bzl", "pinned_maven_install")
pinned_maven_install()
