function disp_details(id: number, name: string, mail_id?: string) {
    console.log("ID:", id);
    console.log("Name", name);

    if (mail_id != undefined) {
        console.log("Email Id", mail_id);
    }
    disp_details(123, "John");
    disp_details(111, "mary", "mary@xyz.com");
}
    // •	The above example declares a parameterized function. Here, the third parameter, i.e., mail_id is an optional parameter.
    // •	If an optional parameter is not passed a value during the function call, the parameter’s value is set to undefined.
    // •	The function prints the value of mail_id only if the argument is passed a value.




