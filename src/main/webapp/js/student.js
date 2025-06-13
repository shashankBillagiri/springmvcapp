function submitStudentForm() {
    const student = {
        firstName: document.getElementById("firstName").value,
        lastName: document.getElementById("lastName").value,
        gender: document.getElementById("gender").value,
        email: document.getElementById("email").value,
        contactNumber: document.getElementById("contactNumber").value,
        addressLine1: document.getElementById("addressLine1").value,
        addressLine2: document.getElementById("addressLine2").value,
        addressLine3: document.getElementById("addressLine3").value,
        state: document.getElementById("state").value,
        zipcode: document.getElementById("zipcode").value,
        course: document.getElementById("course").value,
        age: document.getElementById("age").value
    };
    console.log("Submitting student:", student);

    fetch("/springmvcapp_war_exploded/student/save", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(student)
    })
        .then(response => response.text())
        .then(data => alert(data))
        .catch(error => alert("Error: " + error));
}
