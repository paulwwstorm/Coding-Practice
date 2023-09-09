// [major].[minor].[patch].[build].[compilation]
// 2, 1.5, 2.12.4.0.6

function VersionCompare( version1, version2 ) {
    version1 = version1.split(".")
    version2 = version2.split(".")

    for (i = 0; i < 5; i++) {
        if (i < version1.length) {
            version1[i] = parseInt(version1[i])
        } else {
            version1.push(0)
        }
    }    
    for (j = 0; j < 5; j++) {
        if (i < version2.length) {
            version2[j] = parseInt(version2[j])
        } else {
            version2.push(0)
        }
    }

    for (k = 0; k < 5; k++) {
        if (version1[k] > version2[k]) {
            return 1
        } else if (version2[k] > version1[k]) {
            return -1
        }
    }

    return 0
}

function VersionCompare1( version1, version2 ) {
    version1 = version1.split(".")
    version2 = version2.split(".")

    for (let i = 0; i < 5; i++) {
        let version1Part = (i < version1.length) ? parseInt(version1[i]) : 0
        let version2Part = (i < version2.length) ? parseInt(version2[i]) : 0
        if (version1Part > version2Part) {
            return 1
        } else if (version2Part > version1Part) {
            return -1
        }
    }

    return 0
}

console.log(VersionCompare1("2.0.2", "0"))
console.log(VersionCompare1("2.0.1", "1.2000.1"))
console.log(VersionCompare1("2", "2.1"))
console.log(VersionCompare1("2", "2.0.0.0.0"))